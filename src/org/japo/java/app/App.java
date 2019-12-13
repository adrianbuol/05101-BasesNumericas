/*
 * Copyright 2019 Adrian Bueno Olmedo - adrian.bueno.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

/**
 *
 * @author Adrián Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public final class App {

//  Constantes
    public static final int BIN01 = 0b110;
    public static final int BIN02 = 0b1100;
    public static final int BIN03 = 0b11001;
    public static final int BIN04 = 0b110011;
    public static final int BIN05 = 01;
    public static final int BIN06 = 013;
    public static final int BIN07 = 0135;
    public static final int BIN08 = 01357;
    public static final int BIN09 = 5;
    public static final int BIN10 = 10;
    public static final int BIN11 = 20;
    public static final int BIN12 = 100;
    public static final int BIN13 = 1000;
    public static final int BIN14 = 0x2;
    public static final int BIN15 = 0xC;
    public static final int BIN16 = 0xCA;
    public static final int BIN17 = 0xB0B0;
    public static final int BIN18 = 0xDAD0;
    public static final int BIN19 = 0xFE0;
    public static final int BIN21 = 0xFF;
    public static final int BIN22 = 2048;
    public static final int BIN23 = 512;
    public static final int BIN24 = 64;
    public static final int BIN25 = 8;
    public static final int BIN26 = 0246;
    public static final int BIN27 = 052;
    public static final int BIN28 = 07;
    public static final int BIN29 = 0b10101010101;
    public static final int BIN30 = 0b111000;
    
    public final void launchApp() {
//  Cabecera
        mostrarCabecera();

//  Ejercicios
        mostrarLinea(1, BIN01);
        mostrarLinea(2, BIN02);
        mostrarLinea(3, BIN03);
        mostrarLinea(4, BIN04);
        mostrarLinea(5, BIN05);
        mostrarLinea(6, BIN06);
        mostrarLinea(7, BIN07);
        mostrarLinea(8, BIN08);
        mostrarLinea(9, BIN09);
        mostrarLinea(10, BIN10);
        mostrarLinea(11, BIN11);
        mostrarLinea(12, BIN12);
        mostrarLinea(13, BIN13);
        mostrarLinea(14, BIN14);
        mostrarLinea(15, BIN15);
        mostrarLinea(16, BIN16);
        mostrarLinea(17, BIN17);
        mostrarLinea(18, BIN18);
        mostrarLinea(19, BIN19);
        mostrarLinea(21, BIN21);
        mostrarLinea(22, BIN22);
        mostrarLinea(23, BIN23);
        mostrarLinea(24, BIN24);
        mostrarLinea(25, BIN25);
        mostrarLinea(26, BIN26);
        mostrarLinea(27, BIN27);
        mostrarLinea(28, BIN28);
        mostrarLinea(29, BIN29);
        mostrarLinea(30, BIN30);
    }

    private void mostrarCabecera() {
        System.out.printf("  # ");
        System.out.printf("Binario            ");
        System.out.printf("Octal    ");
        System.out.printf("Decimal  ");
        System.out.printf("Hexadecimal ");
        System.out.println();
        System.out.printf("=== ");
        System.out.printf("================== ");
        System.out.printf("========");
        System.out.printf(" ======== ");
        System.out.printf("=========== ");
        System.out.println();
    }

    private void mostrarLinea(int numLinea, int dato) {
//        Numero de Linea
        System.out.printf(" %2d ", numLinea);
//        Transformacion a binario del dato 
        System.out.printf("0b%-17s", Integer.toBinaryString(dato));
//        Transformacion a octal del dato 
        System.out.printf("0%-8s ", Integer.toOctalString(dato));
//        Transformacion a Decimal del dato 
        System.out.printf("%-9d", dato);
//        Transformacion a Hexadecimal del dato
        System.out.printf("0x%S ", Integer.toHexString(dato));
        System.out.println();
    }
}
