/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import model.exception.DomainException;

/**
 *
 * @author Matheus
 */
public class Reserva {

    private Integer numeroQuarto;
    private Date checkIn;
    private Date checkOut;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva() {

    }

    public Reserva(Integer numeroQuarto, Date checkIn, Date checkOut) throws DomainException {
        if (checkOut.before(checkIn)) {

            throw new DomainException("A data de checkOut deve ser posterior a data de checkIn");
        }
        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duracao() {

        long dif = checkOut.getTime() - checkIn.getTime();

        return TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);

    }

    public void updateData(Date checkIn, Date checkOut) throws DomainException {

        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {

            throw new DomainException("As datas de atualização devem ser futuras");

        }

        if (checkOut.before(checkIn)) {

            throw new DomainException("A data de checkOut deve ser posterior a data de checkIn");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {

        return "Quarto: " + numeroQuarto + ", checkIn: " + sdf.format(checkIn) + ", checkout: " + sdf.format(checkOut) + ", "
                + duracao() + " noites";
    }

}
