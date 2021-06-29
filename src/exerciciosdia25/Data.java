package exerciciosdia25;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data() {
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data(Data data) {
        this.dia = data.getDia();
        this.mes = data.getMes();
        this.ano = data.getAno();
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void adicionarDia(int dias) {
        GregorianCalendar calendar = new GregorianCalendar();

        Date date = new Date(ano, mes, dia);
        calendar.setTime(date);
        calendar.set(Calendar.YEAR, ano);
        calendar.add(Calendar.DAY_OF_MONTH, dias);

        dia = calendar.get(Calendar.DAY_OF_MONTH);
        mes = calendar.get(Calendar.MONTH);
        ano = calendar.get(Calendar.YEAR);
    }

    @Override
    public String toString() {
        return "Data{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +
                '}';
    }
}
