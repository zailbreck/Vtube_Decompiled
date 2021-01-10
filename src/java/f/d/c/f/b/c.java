/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package f.d.c.f.b;

public final class c {
    private static final c[] d = c.d();
    private final int a;
    private final b[] b;
    private final int c;

    private /* varargs */ c(int n2, int[] arrn, b ... arrb) {
        this.a = n2;
        this.b = arrb;
        int n3 = arrb[0].b();
        a[] arra = arrb[0].a();
        int n4 = arra.length;
        int n5 = 0;
        for (int i2 = 0; i2 < n4; ++i2) {
            a a2 = arra[i2];
            n5 += a2.a() * (n3 + a2.b());
        }
        this.c = n5;
    }

    public static c a(int n2) {
        if (n2 > 0 && n2 <= 40) {
            return d[n2 - 1];
        }
        throw new IllegalArgumentException();
    }

    private static c[] d() {
        c[] arrc = new c[40];
        int[] arrn = new int[]{};
        b[] arrb = new b[4];
        a[] arra = new a[]{new a(1, 19)};
        arrb[0] = new b(7, arra);
        a[] arra2 = new a[]{new a(1, 16)};
        arrb[1] = new b(10, arra2);
        a[] arra3 = new a[]{new a(1, 13)};
        arrb[2] = new b(13, arra3);
        a[] arra4 = new a[]{new a(1, 9)};
        arrb[3] = new b(17, arra4);
        arrc[0] = new c(1, arrn, arrb);
        int[] arrn2 = new int[]{6, 18};
        b[] arrb2 = new b[4];
        a[] arra5 = new a[]{new a(1, 34)};
        arrb2[0] = new b(10, arra5);
        a[] arra6 = new a[]{new a(1, 28)};
        arrb2[1] = new b(16, arra6);
        a[] arra7 = new a[]{new a(1, 22)};
        arrb2[2] = new b(22, arra7);
        a[] arra8 = new a[]{new a(1, 16)};
        arrb2[3] = new b(28, arra8);
        arrc[1] = new c(2, arrn2, arrb2);
        int[] arrn3 = new int[]{6, 22};
        b[] arrb3 = new b[4];
        a[] arra9 = new a[]{new a(1, 55)};
        arrb3[0] = new b(15, arra9);
        a[] arra10 = new a[]{new a(1, 44)};
        arrb3[1] = new b(26, arra10);
        a[] arra11 = new a[]{new a(2, 17)};
        arrb3[2] = new b(18, arra11);
        a[] arra12 = new a[]{new a(2, 13)};
        arrb3[3] = new b(22, arra12);
        arrc[2] = new c(3, arrn3, arrb3);
        int[] arrn4 = new int[]{6, 26};
        b[] arrb4 = new b[4];
        a[] arra13 = new a[]{new a(1, 80)};
        arrb4[0] = new b(20, arra13);
        a[] arra14 = new a[]{new a(2, 32)};
        arrb4[1] = new b(18, arra14);
        a[] arra15 = new a[]{new a(2, 24)};
        arrb4[2] = new b(26, arra15);
        a[] arra16 = new a[]{new a(4, 9)};
        arrb4[3] = new b(16, arra16);
        arrc[3] = new c(4, arrn4, arrb4);
        int[] arrn5 = new int[]{6, 30};
        b[] arrb5 = new b[4];
        a[] arra17 = new a[]{new a(1, 108)};
        arrb5[0] = new b(26, arra17);
        a[] arra18 = new a[]{new a(2, 43)};
        arrb5[1] = new b(24, arra18);
        a[] arra19 = new a[]{new a(2, 15), new a(2, 16)};
        arrb5[2] = new b(18, arra19);
        a[] arra20 = new a[]{new a(2, 11), new a(2, 12)};
        arrb5[3] = new b(22, arra20);
        arrc[4] = new c(5, arrn5, arrb5);
        int[] arrn6 = new int[]{6, 34};
        b[] arrb6 = new b[4];
        a[] arra21 = new a[]{new a(2, 68)};
        arrb6[0] = new b(18, arra21);
        a[] arra22 = new a[]{new a(4, 27)};
        arrb6[1] = new b(16, arra22);
        a[] arra23 = new a[]{new a(4, 19)};
        arrb6[2] = new b(24, arra23);
        a[] arra24 = new a[]{new a(4, 15)};
        arrb6[3] = new b(28, arra24);
        arrc[5] = new c(6, arrn6, arrb6);
        int[] arrn7 = new int[]{6, 22, 38};
        b[] arrb7 = new b[4];
        a[] arra25 = new a[]{new a(2, 78)};
        arrb7[0] = new b(20, arra25);
        a[] arra26 = new a[]{new a(4, 31)};
        arrb7[1] = new b(18, arra26);
        a[] arra27 = new a[]{new a(2, 14), new a(4, 15)};
        arrb7[2] = new b(18, arra27);
        a[] arra28 = new a[]{new a(4, 13), new a(1, 14)};
        arrb7[3] = new b(26, arra28);
        arrc[6] = new c(7, arrn7, arrb7);
        int[] arrn8 = new int[]{6, 24, 42};
        b[] arrb8 = new b[4];
        a[] arra29 = new a[]{new a(2, 97)};
        arrb8[0] = new b(24, arra29);
        a[] arra30 = new a[]{new a(2, 38), new a(2, 39)};
        arrb8[1] = new b(22, arra30);
        a[] arra31 = new a[]{new a(4, 18), new a(2, 19)};
        arrb8[2] = new b(22, arra31);
        a[] arra32 = new a[]{new a(4, 14), new a(2, 15)};
        arrb8[3] = new b(26, arra32);
        arrc[7] = new c(8, arrn8, arrb8);
        int[] arrn9 = new int[]{6, 26, 46};
        b[] arrb9 = new b[4];
        a[] arra33 = new a[]{new a(2, 116)};
        arrb9[0] = new b(30, arra33);
        a[] arra34 = new a[]{new a(3, 36), new a(2, 37)};
        arrb9[1] = new b(22, arra34);
        a[] arra35 = new a[]{new a(4, 16), new a(4, 17)};
        arrb9[2] = new b(20, arra35);
        a[] arra36 = new a[]{new a(4, 12), new a(4, 13)};
        arrb9[3] = new b(24, arra36);
        arrc[8] = new c(9, arrn9, arrb9);
        int[] arrn10 = new int[]{6, 28, 50};
        b[] arrb10 = new b[4];
        a[] arra37 = new a[]{new a(2, 68), new a(2, 69)};
        arrb10[0] = new b(18, arra37);
        a[] arra38 = new a[]{new a(4, 43), new a(1, 44)};
        arrb10[1] = new b(26, arra38);
        a[] arra39 = new a[]{new a(6, 19), new a(2, 20)};
        arrb10[2] = new b(24, arra39);
        a[] arra40 = new a[]{new a(6, 15), new a(2, 16)};
        arrb10[3] = new b(28, arra40);
        arrc[9] = new c(10, arrn10, arrb10);
        int[] arrn11 = new int[]{6, 30, 54};
        b[] arrb11 = new b[4];
        a[] arra41 = new a[]{new a(4, 81)};
        arrb11[0] = new b(20, arra41);
        a[] arra42 = new a[]{new a(1, 50), new a(4, 51)};
        arrb11[1] = new b(30, arra42);
        a[] arra43 = new a[]{new a(4, 22), new a(4, 23)};
        arrb11[2] = new b(28, arra43);
        a[] arra44 = new a[]{new a(3, 12), new a(8, 13)};
        arrb11[3] = new b(24, arra44);
        arrc[10] = new c(11, arrn11, arrb11);
        int[] arrn12 = new int[]{6, 32, 58};
        b[] arrb12 = new b[4];
        a[] arra45 = new a[]{new a(2, 92), new a(2, 93)};
        arrb12[0] = new b(24, arra45);
        a[] arra46 = new a[]{new a(6, 36), new a(2, 37)};
        arrb12[1] = new b(22, arra46);
        a[] arra47 = new a[]{new a(4, 20), new a(6, 21)};
        arrb12[2] = new b(26, arra47);
        a[] arra48 = new a[]{new a(7, 14), new a(4, 15)};
        arrb12[3] = new b(28, arra48);
        arrc[11] = new c(12, arrn12, arrb12);
        int[] arrn13 = new int[]{6, 34, 62};
        b[] arrb13 = new b[4];
        a[] arra49 = new a[]{new a(4, 107)};
        arrb13[0] = new b(26, arra49);
        a[] arra50 = new a[]{new a(8, 37), new a(1, 38)};
        arrb13[1] = new b(22, arra50);
        a[] arra51 = new a[]{new a(8, 20), new a(4, 21)};
        arrb13[2] = new b(24, arra51);
        a[] arra52 = new a[]{new a(12, 11), new a(4, 12)};
        arrb13[3] = new b(22, arra52);
        arrc[12] = new c(13, arrn13, arrb13);
        int[] arrn14 = new int[]{6, 26, 46, 66};
        b[] arrb14 = new b[4];
        a[] arra53 = new a[]{new a(3, 115), new a(1, 116)};
        arrb14[0] = new b(30, arra53);
        a[] arra54 = new a[]{new a(4, 40), new a(5, 41)};
        arrb14[1] = new b(24, arra54);
        a[] arra55 = new a[]{new a(11, 16), new a(5, 17)};
        arrb14[2] = new b(20, arra55);
        a[] arra56 = new a[]{new a(11, 12), new a(5, 13)};
        arrb14[3] = new b(24, arra56);
        arrc[13] = new c(14, arrn14, arrb14);
        int[] arrn15 = new int[]{6, 26, 48, 70};
        b[] arrb15 = new b[4];
        a[] arra57 = new a[]{new a(5, 87), new a(1, 88)};
        arrb15[0] = new b(22, arra57);
        a[] arra58 = new a[]{new a(5, 41), new a(5, 42)};
        arrb15[1] = new b(24, arra58);
        a[] arra59 = new a[]{new a(5, 24), new a(7, 25)};
        arrb15[2] = new b(30, arra59);
        a[] arra60 = new a[]{new a(11, 12), new a(7, 13)};
        arrb15[3] = new b(24, arra60);
        arrc[14] = new c(15, arrn15, arrb15);
        int[] arrn16 = new int[]{6, 26, 50, 74};
        b[] arrb16 = new b[4];
        a[] arra61 = new a[]{new a(5, 98), new a(1, 99)};
        arrb16[0] = new b(24, arra61);
        a[] arra62 = new a[]{new a(7, 45), new a(3, 46)};
        arrb16[1] = new b(28, arra62);
        a[] arra63 = new a[]{new a(15, 19), new a(2, 20)};
        arrb16[2] = new b(24, arra63);
        a[] arra64 = new a[]{new a(3, 15), new a(13, 16)};
        arrb16[3] = new b(30, arra64);
        arrc[15] = new c(16, arrn16, arrb16);
        int[] arrn17 = new int[]{6, 30, 54, 78};
        b[] arrb17 = new b[4];
        a[] arra65 = new a[]{new a(1, 107), new a(5, 108)};
        arrb17[0] = new b(28, arra65);
        a[] arra66 = new a[]{new a(10, 46), new a(1, 47)};
        arrb17[1] = new b(28, arra66);
        a[] arra67 = new a[]{new a(1, 22), new a(15, 23)};
        arrb17[2] = new b(28, arra67);
        a[] arra68 = new a[]{new a(2, 14), new a(17, 15)};
        arrb17[3] = new b(28, arra68);
        arrc[16] = new c(17, arrn17, arrb17);
        int[] arrn18 = new int[]{6, 30, 56, 82};
        b[] arrb18 = new b[4];
        a[] arra69 = new a[]{new a(5, 120), new a(1, 121)};
        arrb18[0] = new b(30, arra69);
        a[] arra70 = new a[]{new a(9, 43), new a(4, 44)};
        arrb18[1] = new b(26, arra70);
        a[] arra71 = new a[]{new a(17, 22), new a(1, 23)};
        arrb18[2] = new b(28, arra71);
        a[] arra72 = new a[]{new a(2, 14), new a(19, 15)};
        arrb18[3] = new b(28, arra72);
        arrc[17] = new c(18, arrn18, arrb18);
        int[] arrn19 = new int[]{6, 30, 58, 86};
        b[] arrb19 = new b[4];
        a[] arra73 = new a[]{new a(3, 113), new a(4, 114)};
        arrb19[0] = new b(28, arra73);
        a[] arra74 = new a[]{new a(3, 44), new a(11, 45)};
        arrb19[1] = new b(26, arra74);
        a[] arra75 = new a[]{new a(17, 21), new a(4, 22)};
        arrb19[2] = new b(26, arra75);
        a[] arra76 = new a[]{new a(9, 13), new a(16, 14)};
        arrb19[3] = new b(26, arra76);
        arrc[18] = new c(19, arrn19, arrb19);
        int[] arrn20 = new int[]{6, 34, 62, 90};
        b[] arrb20 = new b[4];
        a[] arra77 = new a[]{new a(3, 107), new a(5, 108)};
        arrb20[0] = new b(28, arra77);
        a[] arra78 = new a[]{new a(3, 41), new a(13, 42)};
        arrb20[1] = new b(26, arra78);
        a[] arra79 = new a[]{new a(15, 24), new a(5, 25)};
        arrb20[2] = new b(30, arra79);
        a[] arra80 = new a[]{new a(15, 15), new a(10, 16)};
        arrb20[3] = new b(28, arra80);
        arrc[19] = new c(20, arrn20, arrb20);
        int[] arrn21 = new int[]{6, 28, 50, 72, 94};
        b[] arrb21 = new b[4];
        a[] arra81 = new a[]{new a(4, 116), new a(4, 117)};
        arrb21[0] = new b(28, arra81);
        a[] arra82 = new a[]{new a(17, 42)};
        arrb21[1] = new b(26, arra82);
        a[] arra83 = new a[]{new a(17, 22), new a(6, 23)};
        arrb21[2] = new b(28, arra83);
        a[] arra84 = new a[]{new a(19, 16), new a(6, 17)};
        arrb21[3] = new b(30, arra84);
        arrc[20] = new c(21, arrn21, arrb21);
        int[] arrn22 = new int[]{6, 26, 50, 74, 98};
        b[] arrb22 = new b[4];
        a[] arra85 = new a[]{new a(2, 111), new a(7, 112)};
        arrb22[0] = new b(28, arra85);
        a[] arra86 = new a[]{new a(17, 46)};
        arrb22[1] = new b(28, arra86);
        a[] arra87 = new a[]{new a(7, 24), new a(16, 25)};
        arrb22[2] = new b(30, arra87);
        a[] arra88 = new a[]{new a(34, 13)};
        arrb22[3] = new b(24, arra88);
        arrc[21] = new c(22, arrn22, arrb22);
        int[] arrn23 = new int[]{6, 30, 54, 78, 102};
        b[] arrb23 = new b[4];
        a[] arra89 = new a[]{new a(4, 121), new a(5, 122)};
        arrb23[0] = new b(30, arra89);
        a[] arra90 = new a[]{new a(4, 47), new a(14, 48)};
        arrb23[1] = new b(28, arra90);
        a[] arra91 = new a[]{new a(11, 24), new a(14, 25)};
        arrb23[2] = new b(30, arra91);
        a[] arra92 = new a[]{new a(16, 15), new a(14, 16)};
        arrb23[3] = new b(30, arra92);
        arrc[22] = new c(23, arrn23, arrb23);
        int[] arrn24 = new int[]{6, 28, 54, 80, 106};
        b[] arrb24 = new b[4];
        a[] arra93 = new a[]{new a(6, 117), new a(4, 118)};
        arrb24[0] = new b(30, arra93);
        a[] arra94 = new a[]{new a(6, 45), new a(14, 46)};
        arrb24[1] = new b(28, arra94);
        a[] arra95 = new a[]{new a(11, 24), new a(16, 25)};
        arrb24[2] = new b(30, arra95);
        a[] arra96 = new a[]{new a(30, 16), new a(2, 17)};
        arrb24[3] = new b(30, arra96);
        arrc[23] = new c(24, arrn24, arrb24);
        int[] arrn25 = new int[]{6, 32, 58, 84, 110};
        b[] arrb25 = new b[4];
        a[] arra97 = new a[]{new a(8, 106), new a(4, 107)};
        arrb25[0] = new b(26, arra97);
        a[] arra98 = new a[]{new a(8, 47), new a(13, 48)};
        arrb25[1] = new b(28, arra98);
        a[] arra99 = new a[]{new a(7, 24), new a(22, 25)};
        arrb25[2] = new b(30, arra99);
        a[] arra100 = new a[]{new a(22, 15), new a(13, 16)};
        arrb25[3] = new b(30, arra100);
        arrc[24] = new c(25, arrn25, arrb25);
        int[] arrn26 = new int[]{6, 30, 58, 86, 114};
        b[] arrb26 = new b[4];
        a[] arra101 = new a[]{new a(10, 114), new a(2, 115)};
        arrb26[0] = new b(28, arra101);
        a[] arra102 = new a[]{new a(19, 46), new a(4, 47)};
        arrb26[1] = new b(28, arra102);
        a[] arra103 = new a[]{new a(28, 22), new a(6, 23)};
        arrb26[2] = new b(28, arra103);
        a[] arra104 = new a[]{new a(33, 16), new a(4, 17)};
        arrb26[3] = new b(30, arra104);
        arrc[25] = new c(26, arrn26, arrb26);
        int[] arrn27 = new int[]{6, 34, 62, 90, 118};
        b[] arrb27 = new b[4];
        a[] arra105 = new a[]{new a(8, 122), new a(4, 123)};
        arrb27[0] = new b(30, arra105);
        a[] arra106 = new a[]{new a(22, 45), new a(3, 46)};
        arrb27[1] = new b(28, arra106);
        a[] arra107 = new a[]{new a(8, 23), new a(26, 24)};
        arrb27[2] = new b(30, arra107);
        a[] arra108 = new a[]{new a(12, 15), new a(28, 16)};
        arrb27[3] = new b(30, arra108);
        arrc[26] = new c(27, arrn27, arrb27);
        int[] arrn28 = new int[]{6, 26, 50, 74, 98, 122};
        b[] arrb28 = new b[4];
        a[] arra109 = new a[]{new a(3, 117), new a(10, 118)};
        arrb28[0] = new b(30, arra109);
        a[] arra110 = new a[]{new a(3, 45), new a(23, 46)};
        arrb28[1] = new b(28, arra110);
        a[] arra111 = new a[]{new a(4, 24), new a(31, 25)};
        arrb28[2] = new b(30, arra111);
        a[] arra112 = new a[]{new a(11, 15), new a(31, 16)};
        arrb28[3] = new b(30, arra112);
        arrc[27] = new c(28, arrn28, arrb28);
        int[] arrn29 = new int[]{6, 30, 54, 78, 102, 126};
        b[] arrb29 = new b[4];
        a[] arra113 = new a[]{new a(7, 116), new a(7, 117)};
        arrb29[0] = new b(30, arra113);
        a[] arra114 = new a[]{new a(21, 45), new a(7, 46)};
        arrb29[1] = new b(28, arra114);
        a[] arra115 = new a[]{new a(1, 23), new a(37, 24)};
        arrb29[2] = new b(30, arra115);
        a[] arra116 = new a[]{new a(19, 15), new a(26, 16)};
        arrb29[3] = new b(30, arra116);
        arrc[28] = new c(29, arrn29, arrb29);
        int[] arrn30 = new int[]{6, 26, 52, 78, 104, 130};
        b[] arrb30 = new b[4];
        a[] arra117 = new a[]{new a(5, 115), new a(10, 116)};
        arrb30[0] = new b(30, arra117);
        a[] arra118 = new a[]{new a(19, 47), new a(10, 48)};
        arrb30[1] = new b(28, arra118);
        a[] arra119 = new a[]{new a(15, 24), new a(25, 25)};
        arrb30[2] = new b(30, arra119);
        a[] arra120 = new a[]{new a(23, 15), new a(25, 16)};
        arrb30[3] = new b(30, arra120);
        arrc[29] = new c(30, arrn30, arrb30);
        int[] arrn31 = new int[]{6, 30, 56, 82, 108, 134};
        b[] arrb31 = new b[4];
        a[] arra121 = new a[]{new a(13, 115), new a(3, 116)};
        arrb31[0] = new b(30, arra121);
        a[] arra122 = new a[]{new a(2, 46), new a(29, 47)};
        arrb31[1] = new b(28, arra122);
        a[] arra123 = new a[]{new a(42, 24), new a(1, 25)};
        arrb31[2] = new b(30, arra123);
        a[] arra124 = new a[]{new a(23, 15), new a(28, 16)};
        arrb31[3] = new b(30, arra124);
        arrc[30] = new c(31, arrn31, arrb31);
        int[] arrn32 = new int[]{6, 34, 60, 86, 112, 138};
        b[] arrb32 = new b[4];
        a[] arra125 = new a[]{new a(17, 115)};
        arrb32[0] = new b(30, arra125);
        a[] arra126 = new a[]{new a(10, 46), new a(23, 47)};
        arrb32[1] = new b(28, arra126);
        a[] arra127 = new a[]{new a(10, 24), new a(35, 25)};
        arrb32[2] = new b(30, arra127);
        a[] arra128 = new a[]{new a(19, 15), new a(35, 16)};
        arrb32[3] = new b(30, arra128);
        arrc[31] = new c(32, arrn32, arrb32);
        int[] arrn33 = new int[]{6, 30, 58, 86, 114, 142};
        b[] arrb33 = new b[4];
        a[] arra129 = new a[]{new a(17, 115), new a(1, 116)};
        arrb33[0] = new b(30, arra129);
        a[] arra130 = new a[]{new a(14, 46), new a(21, 47)};
        arrb33[1] = new b(28, arra130);
        a[] arra131 = new a[]{new a(29, 24), new a(19, 25)};
        arrb33[2] = new b(30, arra131);
        a[] arra132 = new a[]{new a(11, 15), new a(46, 16)};
        arrb33[3] = new b(30, arra132);
        arrc[32] = new c(33, arrn33, arrb33);
        int[] arrn34 = new int[]{6, 34, 62, 90, 118, 146};
        b[] arrb34 = new b[4];
        a[] arra133 = new a[]{new a(13, 115), new a(6, 116)};
        arrb34[0] = new b(30, arra133);
        a[] arra134 = new a[]{new a(14, 46), new a(23, 47)};
        arrb34[1] = new b(28, arra134);
        a[] arra135 = new a[]{new a(44, 24), new a(7, 25)};
        arrb34[2] = new b(30, arra135);
        a[] arra136 = new a[]{new a(59, 16), new a(1, 17)};
        arrb34[3] = new b(30, arra136);
        arrc[33] = new c(34, arrn34, arrb34);
        int[] arrn35 = new int[]{6, 30, 54, 78, 102, 126, 150};
        b[] arrb35 = new b[4];
        a[] arra137 = new a[]{new a(12, 121), new a(7, 122)};
        arrb35[0] = new b(30, arra137);
        a[] arra138 = new a[]{new a(12, 47), new a(26, 48)};
        arrb35[1] = new b(28, arra138);
        a[] arra139 = new a[]{new a(39, 24), new a(14, 25)};
        arrb35[2] = new b(30, arra139);
        a[] arra140 = new a[]{new a(22, 15), new a(41, 16)};
        arrb35[3] = new b(30, arra140);
        arrc[34] = new c(35, arrn35, arrb35);
        int[] arrn36 = new int[]{6, 24, 50, 76, 102, 128, 154};
        b[] arrb36 = new b[4];
        a[] arra141 = new a[]{new a(6, 121), new a(14, 122)};
        arrb36[0] = new b(30, arra141);
        a[] arra142 = new a[]{new a(6, 47), new a(34, 48)};
        arrb36[1] = new b(28, arra142);
        a[] arra143 = new a[]{new a(46, 24), new a(10, 25)};
        arrb36[2] = new b(30, arra143);
        a[] arra144 = new a[]{new a(2, 15), new a(64, 16)};
        arrb36[3] = new b(30, arra144);
        arrc[35] = new c(36, arrn36, arrb36);
        int[] arrn37 = new int[]{6, 28, 54, 80, 106, 132, 158};
        b[] arrb37 = new b[4];
        a[] arra145 = new a[]{new a(17, 122), new a(4, 123)};
        arrb37[0] = new b(30, arra145);
        a[] arra146 = new a[]{new a(29, 46), new a(14, 47)};
        arrb37[1] = new b(28, arra146);
        a[] arra147 = new a[]{new a(49, 24), new a(10, 25)};
        arrb37[2] = new b(30, arra147);
        a[] arra148 = new a[]{new a(24, 15), new a(46, 16)};
        arrb37[3] = new b(30, arra148);
        arrc[36] = new c(37, arrn37, arrb37);
        int[] arrn38 = new int[]{6, 32, 58, 84, 110, 136, 162};
        b[] arrb38 = new b[4];
        a[] arra149 = new a[]{new a(4, 122), new a(18, 123)};
        arrb38[0] = new b(30, arra149);
        a[] arra150 = new a[]{new a(13, 46), new a(32, 47)};
        arrb38[1] = new b(28, arra150);
        a[] arra151 = new a[]{new a(48, 24), new a(14, 25)};
        arrb38[2] = new b(30, arra151);
        a[] arra152 = new a[]{new a(42, 15), new a(32, 16)};
        arrb38[3] = new b(30, arra152);
        arrc[37] = new c(38, arrn38, arrb38);
        int[] arrn39 = new int[]{6, 26, 54, 82, 110, 138, 166};
        b[] arrb39 = new b[4];
        a[] arra153 = new a[]{new a(20, 117), new a(4, 118)};
        arrb39[0] = new b(30, arra153);
        a[] arra154 = new a[]{new a(40, 47), new a(7, 48)};
        arrb39[1] = new b(28, arra154);
        a[] arra155 = new a[]{new a(43, 24), new a(22, 25)};
        arrb39[2] = new b(30, arra155);
        a[] arra156 = new a[]{new a(10, 15), new a(67, 16)};
        arrb39[3] = new b(30, arra156);
        arrc[38] = new c(39, arrn39, arrb39);
        int[] arrn40 = new int[]{6, 30, 58, 86, 114, 142, 170};
        b[] arrb40 = new b[4];
        a[] arra157 = new a[]{new a(19, 118), new a(6, 119)};
        arrb40[0] = new b(30, arra157);
        a[] arra158 = new a[]{new a(18, 47), new a(31, 48)};
        arrb40[1] = new b(28, arra158);
        a[] arra159 = new a[]{new a(34, 24), new a(34, 25)};
        arrb40[2] = new b(30, arra159);
        a[] arra160 = new a[]{new a(20, 15), new a(61, 16)};
        arrb40[3] = new b(30, arra160);
        arrc[39] = new c(40, arrn40, arrb40);
        return arrc;
    }

    public int a() {
        return 17 + 4 * this.a;
    }

    public b a(f.d.c.f.b.a a2) {
        return this.b[a2.ordinal()];
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    public String toString() {
        return String.valueOf((int)this.a);
    }

    public static final class a {
        private final int a;
        private final int b;

        a(int n2, int n3) {
            this.a = n2;
            this.b = n3;
        }

        public int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }
    }

    public static final class b {
        private final int a;
        private final a[] b;

        /* varargs */ b(int n2, a ... arra) {
            this.a = n2;
            this.b = arra;
        }

        public a[] a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }

        public int c() {
            a[] arra = this.b;
            int n2 = arra.length;
            int n3 = 0;
            for (int i2 = 0; i2 < n2; ++i2) {
                n3 += arra[i2].a();
            }
            return n3;
        }

        public int d() {
            return this.a * this.c();
        }
    }

}

