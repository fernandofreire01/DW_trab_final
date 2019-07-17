/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;

/**
 *
 * @author hatake-attack
 */
@ManagedBean(name = "vendaColunasBean")
@RequestScoped
public class vendaColunasBean {
    BarChartModel Vendas;

    public BarChartModel getVendas() {
        return Vendas;
    }

    public void setVendas(BarChartModel Vendas) {
        this.Vendas = Vendas;
    }
    /**
     * Creates a new instance of vendasColunasBean
     */
    public vendaColunasBean() {
        Vendas = new BarChartModel();
        
        ChartSeries brasil = new ChartSeries();
        brasil.setLabel("Brasil");
        brasil.set("2008", 191);
        brasil.set("2009", 210);
        brasil.set("2010", 35);
        
        ChartSeries eua = new ChartSeries();
        eua.setLabel("EUA");
        eua.set("2008", 163);
        eua.set("2009", 300);
        eua.set("2010", 45);
        
        ChartSeries alemanha = new ChartSeries();
        alemanha.setLabel("Alemanha");
        alemanha.set("2008", 178);
        alemanha.set("2009", 275);
        alemanha.set("2010", 60);
        
        Vendas.addSeries(brasil);
        Vendas.addSeries(eua);
        Vendas.addSeries(alemanha);
        Vendas.setTitle("Gráfico de vendas por país");
        Vendas.setLegendPosition("ne");
        
        
    }
    
}
