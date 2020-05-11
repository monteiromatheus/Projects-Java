/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import entidadesEnum.Nivel;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Matheus
 */
public class Trabalhador {

    private String name;
    private Nivel nivel;
    private Double salarioBase;

    private Departamento departamento;
    private List<HorasContrato> contrato = new ArrayList<>();

    public Trabalhador() {

    }

    public Trabalhador(String name, Nivel nivel, Double salarioBase, Departamento departamento) {
        this.name = name;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<HorasContrato> getContrato() {
        return contrato;
    }

    public void adicionarContrato(HorasContrato contratos) {

        contrato.add(contratos);
    }

    public void removerContrato(HorasContrato contratos) {

        contrato.remove(contratos);
    }

    public double ganhos(int ano, int mes) {

        double soma = salarioBase;
        Calendar cal = Calendar.getInstance();
        for (HorasContrato c : contrato) {
            cal.setTime(c.getData());
            int c_ano = cal.get(Calendar.YEAR);
            int c_mes = 1 + cal.get(Calendar.MONTH);
            if (ano == c_ano && mes == c_mes) {

                soma += c.totalValor();
            }
        }

        return soma;
    }
}
