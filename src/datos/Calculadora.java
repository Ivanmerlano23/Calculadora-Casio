/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;
import gui.FormCal;
/**
 *
 * @author Ivan Merlano
 */

public class Calculadora {
    private String n0;
    private String n1;
    private String n2;
    private String n3;
    private String n4;
    private String n5;
    private String n6;
    private String n7;
    private String n8;
    private String n9;
    private String punto;
    private String resultadoexacto;
    private String smenos;
    private String pi;
    
    public Calculadora(String n0, String n1, String n2, String n3, String n4, String n5, String n6, String n7, String n8, String n9, String punto, String resultadoexacto, String smenos, String pi){
        this.n0 = n0;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
        this.n6 = n6;
        this.n7 = n7;
        this.n8 = n8;
        this.n9 = n9;
        this.punto = punto;
        this.resultadoexacto = resultadoexacto;
        this.smenos = smenos;
        this.pi=pi;
    }

    public Calculadora() {
        
    }

    @Override
    public String toString() {
        return "Calculadora{" + "n0=" + n0 + ", n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + ", n4=" + n4 + ", n5=" + n5 + ", n6=" + n6 + ", n7=" + n7 + ", n8=" + n8 + ", n9=" + n9 + ", punto=" + punto + ", resultadoexacto=" + resultadoexacto + ", smenos=" + smenos + ", pi=" + pi + '}';
    }

   
    public String cero(){
       return n0="0";
    }
    
    public String numeroUno(){
        return n1="1";
    }
    
    public String numeroDos(){
        return n2="2";
    }
    
    public String numeroTres(){
        return n3="3";
    }
    
    public String numeroCuatro(){
        return n4="4";
    }
 
    public String numeroCinco(){
        return n5="5";
    }
     
    public String numeroSeis(){
        return n6="6";
    }
     
    public String numeroSiete(){
        return n7="7";
    }
     
    public String numeroOcho(){
        return n8="8";
    }
     
    public String numeroNueve(){
        return n9="9";
    }
    public String punto(){
        return punto=".";
    }
    public String smenos(){
        return smenos="-";
    }
    
    
    public String resultadoExacto(float exacto){
        String total="";
        total=Float.toString(exacto);
        
        if(exacto % 1==0){
            total=total.substring(0, total.length()-2);
        }
        return total;
    }
    
    public String pi(){
        return pi="3.14159265359";
    }

    /**
     * @return the n0
     */
    public String getN0() {
        return n0;
    }

    /**
     * @param n0 the n0 to set
     */
    public void setN0(String n0) {
        this.n0 = n0;
    }

    /**
     * @return the n1
     */
    public String getN1() {
        return n1;
    }

    /**
     * @param n1 the n1 to set
     */
    public void setN1(String n1) {
        this.n1 = n1;
    }

    /**
     * @return the n2
     */
    public String getN2() {
        return n2;
    }

    /**
     * @param n2 the n2 to set
     */
    public void setN2(String n2) {
        this.n2 = n2;
    }

    /**
     * @return the n3
     */
    public String getN3() {
        return n3;
    }

    /**
     * @param n3 the n3 to set
     */
    public void setN3(String n3) {
        this.n3 = n3;
    }

    /**
     * @return the n4
     */
    public String getN4() {
        return n4;
    }

    /**
     * @param n4 the n4 to set
     */
    public void setN4(String n4) {
        this.n4 = n4;
    }

    /**
     * @return the n5
     */
    public String getN5() {
        return n5;
    }

    /**
     * @param n5 the n5 to set
     */
    public void setN5(String n5) {
        this.n5 = n5;
    }

    /**
     * @return the n6
     */
    public String getN6() {
        return n6;
    }

    /**
     * @param n6 the n6 to set
     */
    public void setN6(String n6) {
        this.n6 = n6;
    }

    /**
     * @return the n7
     */
    public String getN7() {
        return n7;
    }

    /**
     * @param n7 the n7 to set
     */
    public void setN7(String n7) {
        this.n7 = n7;
    }

    /**
     * @return the n8
     */
    public String getN8() {
        return n8;
    }

    /**
     * @param n8 the n8 to set
     */
    public void setN8(String n8) {
        this.n8 = n8;
    }

    /**
     * @return the n9
     */
    public String getN9() {
        return n9;
    }

    /**
     * @param n9 the n9 to set
     */
    public void setN9(String n9) {
        this.n9 = n9;
    }

    /**
     * @return the punto
     */
    public String getPunto() {
        return punto;
    }

    /**
     * @param punto the punto to set
     */
    public void setPunto(String punto) {
        this.punto = punto;
    }

    /**
     * @return the resultadoexacto
     */
    public String getResultadoexacto() {
        return resultadoexacto;
    }

    /**
     * @param resultadoexacto the resultadoexacto to set
     */
    public void setResultadoexacto(String resultadoexacto) {
        this.resultadoexacto = resultadoexacto;
    }

    /**
     * @return the smenos
     */
    public String getSmenos() {
        return smenos;
    }

    /**
     * @param smenos the smenos to set
     */
    public void setSmenos(String smenos) {
        this.smenos = smenos;
    }

    /**
     * @return the pi
     */
    public String getPi() {
        return pi;
    }

    
}
