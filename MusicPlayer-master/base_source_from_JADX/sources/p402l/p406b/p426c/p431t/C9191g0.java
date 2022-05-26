package p402l.p406b.p426c.p431t;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: l.b.c.t.g0 */
/* compiled from: ID3v24PreferredFrameOrderComparator */
public class C9191g0 implements Comparator<String> {

    /* renamed from: g */
    private static C9191g0 f35861g;

    /* renamed from: h */
    private static List f35862h;

    static {
        ArrayList arrayList = new ArrayList();
        f35862h = arrayList;
        arrayList.add("UFID");
        f35862h.add("TIT2");
        f35862h.add("TPE1");
        f35862h.add("TALB");
        f35862h.add("TSOA");
        f35862h.add("TCON");
        f35862h.add("TCOM");
        f35862h.add("TPE3");
        f35862h.add("TIT1");
        f35862h.add("TRCK");
        f35862h.add("TDRC");
        f35862h.add("TPE2");
        f35862h.add("TBPM");
        f35862h.add("TSRC");
        f35862h.add("TSOT");
        f35862h.add("TIT3");
        f35862h.add("USLT");
        f35862h.add("TXXX");
        f35862h.add("WXXX");
        f35862h.add("WOAR");
        f35862h.add("WCOM");
        f35862h.add("WCOP");
        f35862h.add("WOAF");
        f35862h.add("WORS");
        f35862h.add("WPAY");
        f35862h.add("WPUB");
        f35862h.add("WCOM");
        f35862h.add("TEXT");
        f35862h.add("TMED");
        f35862h.add("TIPL");
        f35862h.add("TLAN");
        f35862h.add("TSOP");
        f35862h.add("TDLY");
        f35862h.add("PCNT");
        f35862h.add("POPM");
        f35862h.add("TPUB");
        f35862h.add("TSO2");
        f35862h.add("TSOC");
        f35862h.add("TCMP");
        f35862h.add("COMM");
        f35862h.add("ASPI");
        f35862h.add("COMR");
        f35862h.add("TCOP");
        f35862h.add("TENC");
        f35862h.add("TDEN");
        f35862h.add("ENCR");
        f35862h.add("EQU2");
        f35862h.add("ETCO");
        f35862h.add("TOWN");
        f35862h.add("TFLT");
        f35862h.add("GRID");
        f35862h.add("TSSE");
        f35862h.add("TKEY");
        f35862h.add("TLEN");
        f35862h.add("LINK");
        f35862h.add("TMOO");
        f35862h.add("MLLT");
        f35862h.add("TMCL");
        f35862h.add("TOPE");
        f35862h.add("TDOR");
        f35862h.add("TOFN");
        f35862h.add("TOLY");
        f35862h.add("TOAL");
        f35862h.add("OWNE");
        f35862h.add("POSS");
        f35862h.add("TPRO");
        f35862h.add("TRSN");
        f35862h.add("TRSO");
        f35862h.add("RBUF");
        f35862h.add("RVA2");
        f35862h.add("TDRL");
        f35862h.add("TPE4");
        f35862h.add("RVRB");
        f35862h.add("SEEK");
        f35862h.add("TPOS");
        f35862h.add("TSST");
        f35862h.add("SIGN");
        f35862h.add("SYLT");
        f35862h.add("SYTC");
        f35862h.add("TDTG");
        f35862h.add("USER");
        f35862h.add("APIC");
        f35862h.add("PRIV");
        f35862h.add("MCDI");
        f35862h.add("AENC");
        f35862h.add("GEOB");
    }

    private C9191g0() {
    }

    /* renamed from: b */
    public static C9191g0 m48870b() {
        if (f35861g == null) {
            f35861g = new C9191g0();
        }
        return f35861g;
    }

    /* renamed from: a */
    public int compare(String str, String str2) {
        int indexOf = f35862h.indexOf(str);
        int i = Integer.MAX_VALUE;
        if (indexOf == -1) {
            indexOf = Integer.MAX_VALUE;
        }
        int indexOf2 = f35862h.indexOf(str2);
        if (indexOf2 != -1) {
            i = indexOf2;
        }
        return indexOf == i ? str.compareTo(str2) : indexOf - i;
    }

    public boolean equals(Object obj) {
        return obj instanceof C9191g0;
    }
}
