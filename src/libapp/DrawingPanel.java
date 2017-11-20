package libapp;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PolarAxisLocation;
import org.jfree.chart.plot.PolarPlot;
import org.jfree.chart.renderer.DefaultPolarItemRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class DrawingPanel extends JFrame {

    private static final String title = "Krzywa Róży";

    public DrawingPanel(String title) {
        super(title);
        JFreeChart chart = createChart(createDataset());
        ChartPanel panel = new ChartPanel(chart);
        this.add(panel);
    }

    private static XYDataset createDataset() {
        XYSeriesCollection rozwiazanie = new XYSeriesCollection();
        XYSeries seria = new XYSeries("Przebieg krzywej rozy");
        for (int i = 0; i <=  1000; i++) {
            double theta = Math.toDegrees((i*Math.PI) / 500);         

            if(Dane.rose_count % 2 == 0){
            double r = Dane.rose_long * Math.cos(Math.toRadians(2 * Dane.rose_count * (theta - Dane.rose_move)));
            seria.add(theta, r);
        }
            else{
            double r = Dane.rose_long * Math.cos(Math.toRadians(Dane.rose_count * (theta -  Dane.rose_move)));
            seria.add(theta, r);
            }
        }
        rozwiazanie.addSeries(seria);
        return rozwiazanie;
    }

    private static JFreeChart createChart(XYDataset dataset) {
        
        NumberAxis numberAxis = new NumberAxis();
        numberAxis.setTickLabelsVisible(false);
        
        
        DefaultPolarItemRenderer renderer = new DefaultPolarItemRenderer();
        renderer.setShapesVisible(false);
        
        PolarPlot plot = new PolarPlot(dataset, numberAxis, renderer);
        plot.setCounterClockwise(true);
        plot.setAxisLocation(PolarAxisLocation.EAST_BELOW);
        plot.setAngleOffset(0);
        
        JFreeChart chart = new JFreeChart(title, JFreeChart.DEFAULT_TITLE_FONT, plot, true);
        return chart;
    }

     
    public static JPanel createWoPanel() {
        JFreeChart chart = createChart(createDataset());
        return new ChartPanel(chart);
    }
}