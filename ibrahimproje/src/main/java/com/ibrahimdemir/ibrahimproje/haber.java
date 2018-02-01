package com.ibrahimdemir.ibrahimproje;
/**
 * 
 * @author ibrahim
 *
 */
public class haber {
	private int id;
    private static int COUNT=0;
 
    public String karakter;
    /**
     * 
     * @param karakter
     */
    public haber(String karakter) {
        super();
        this.id=++COUNT;
        this.karakter=karakter;
       }
    /**
     * 
     * @return id
     */
    public int getId() {
        return id;
       }
    /**
     * 
     * @return karakter
     */
    public String getMetin() {
        return karakter;
       }
}
