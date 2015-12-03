package kata6;

import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay<T> extends ApplicationFrame{
    private final Histogram<T> histogram;
    private final String nameXAxis;

    public HistogramDisplay(Histogram<T> histogram, String nameXAxis) {
        super("Histograma");
        this.histogram = histogram;
        this.nameXAxis = nameXAxis;
        setContentPane(createPane());
        pack();
    }
    
    private ChartPanel createPane() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataSet()));
        chartPanel.setPreferredSize(new Dimension(500, 450));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset) {
        JFreeChart chart = ChartFactory.createBarChart(
                "Histograma de dominios",
                nameXAxis,
                "NUMERO",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);
        return chart;
    }
    
    public void execute() {
        setVisible(true);
    }

    private DefaultCategoryDataset createDataSet() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        for (T key : histogram.keySet()) {
            dataset.addValue(histogram.get(key), "", (Comparable) key);
        }
        
        return dataset;
    }
    
    
}