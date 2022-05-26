package p402l.p406b.p426c.p431t;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: l.b.c.t.w */
/* compiled from: ID3v22PreferredFrameOrderComparator */
public class C9250w implements Comparator<String> {

    /* renamed from: g */
    private static C9250w f35951g;

    /* renamed from: h */
    private static List f35952h;

    static {
        ArrayList arrayList = new ArrayList();
        f35952h = arrayList;
        arrayList.add("UFI");
        f35952h.add("TT2");
        f35952h.add("TP1");
        f35952h.add("TAL");
        f35952h.add("TOR");
        f35952h.add("TCO");
        f35952h.add("TCM");
        f35952h.add("TPE");
        f35952h.add("TT1");
        f35952h.add("TRK");
        f35952h.add("TYE");
        f35952h.add("TDA");
        f35952h.add("TIM");
        f35952h.add("TBP");
        f35952h.add("TRC");
        f35952h.add("TOR");
        f35952h.add("TP2");
        f35952h.add("TT3");
        f35952h.add("ULT");
        f35952h.add("TXX");
        f35952h.add("WXX");
        f35952h.add("WAR");
        f35952h.add("WCM");
        f35952h.add("WCP");
        f35952h.add("WAF");
        f35952h.add("WRS");
        f35952h.add("WPAY");
        f35952h.add("WPB");
        f35952h.add("WCM");
        f35952h.add("TXT");
        f35952h.add("TMT");
        f35952h.add("IPL");
        f35952h.add("TLA");
        f35952h.add("TST");
        f35952h.add("TDY");
        f35952h.add("CNT");
        f35952h.add("POP");
        f35952h.add("TPB");
        f35952h.add("TS2");
        f35952h.add("TSC");
        f35952h.add("TCP");
        f35952h.add("TST");
        f35952h.add("TSP");
        f35952h.add("TSA");
        f35952h.add("TS2");
        f35952h.add("TSC");
        f35952h.add("COM");
        f35952h.add("TRD");
        f35952h.add("TCR");
        f35952h.add("TEN");
        f35952h.add("EQU");
        f35952h.add("ETC");
        f35952h.add("TFT");
        f35952h.add("TSS");
        f35952h.add("TKE");
        f35952h.add("TLE");
        f35952h.add("LNK");
        f35952h.add("TSI");
        f35952h.add("MLL");
        f35952h.add("TOA");
        f35952h.add("TOF");
        f35952h.add("TOL");
        f35952h.add("TOT");
        f35952h.add("BUF");
        f35952h.add("TP4");
        f35952h.add("REV");
        f35952h.add("TPA");
        f35952h.add("SLT");
        f35952h.add("STC");
        f35952h.add("PIC");
        f35952h.add("MCI");
        f35952h.add("CRA");
        f35952h.add("GEO");
    }

    private C9250w() {
    }

    /* renamed from: b */
    public static C9250w m49143b() {
        if (f35951g == null) {
            f35951g = new C9250w();
        }
        return f35951g;
    }

    /* renamed from: a */
    public int compare(String str, String str2) {
        int indexOf = f35952h.indexOf(str);
        int i = Integer.MAX_VALUE;
        if (indexOf == -1) {
            indexOf = Integer.MAX_VALUE;
        }
        int indexOf2 = f35952h.indexOf(str2);
        if (indexOf2 != -1) {
            i = indexOf2;
        }
        return indexOf == i ? str.compareTo(str2) : indexOf - i;
    }

    public boolean equals(Object obj) {
        return obj instanceof C9250w;
    }
}
