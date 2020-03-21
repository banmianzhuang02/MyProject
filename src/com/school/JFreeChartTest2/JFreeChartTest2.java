package com.school.JFreeChartTest2;
import java.awt.Font;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class JFreeChartTest2 extends ApplicationFrame
{
    public JFreeChartTest2(String title,int num1,int num2,int num3,int num4,int num5)
    {
        super(title);
        this.setContentPane(createPanel(num1,num2,num3,num4,num5)); //构造函数中自动创建Java的panel面板
    }
    
    public static CategoryDataset createDataset(int num1,int num2,int num3,int num4,int num5) {//创建柱状图数据集
        DefaultCategoryDataset dataset=new DefaultCategoryDataset();
        dataset.setValue(num1,"密切接触","密切接触");
        dataset.setValue(num2,"在武汉","在武汉");
        dataset.setValue(num3,"在湖北","在湖北");
        dataset.setValue(num4,"疑似","疑似");
        dataset.setValue(num5,"确诊","确诊");
        
        return dataset;
    }
    
    public static JFreeChart createChart(CategoryDataset dataset) //用数据集创建一个图表
    {
        JFreeChart chart=ChartFactory.createBarChart("hi", "人员分布", 
                "人员数量", dataset, PlotOrientation.VERTICAL, true, true, false); //创建一个JFreeChart
        chart.setTitle(new TextTitle("疫情状况",new Font("宋体",Font.BOLD+Font.ITALIC,20)));//可以重新设置标题，替换“hi”标题
        CategoryPlot plot=(CategoryPlot)chart.getPlot();//获得图标中间部分，即plot
        CategoryAxis categoryAxis=plot.getDomainAxis();//获得横坐标
        categoryAxis.setLabelFont(new Font("微软雅黑",Font.BOLD,12));//设置横坐标字体
        return chart;
    }
    
    public static JPanel createPanel(int num1,int num2,int num3,int num4,int num5)
    {
        JFreeChart chart =createChart(createDataset(num1,num2,num3,num4,num5));
        return new ChartPanel(chart); //将chart对象放入Panel面板中去，ChartPanel类已继承Jpanel
    }
    
    public static void picture(int num1,int num2,int num3,int num4,int num5)
    {
        JFreeChartTest2 chart=new JFreeChartTest2("疫情柱状图",num1,num2,num3,num4,num5);
        chart.pack();//以合适的大小显示
        chart.setVisible(true);
        
    }
}