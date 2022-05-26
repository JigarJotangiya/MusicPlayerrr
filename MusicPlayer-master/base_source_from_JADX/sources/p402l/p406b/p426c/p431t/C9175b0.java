package p402l.p406b.p426c.p431t;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: l.b.c.t.b0 */
/* compiled from: ID3v23PreferredFrameOrderComparator */
public class C9175b0 implements Comparator<String> {

    /* renamed from: g */
    private static C9175b0 f35816g;

    /* renamed from: h */
    private static List f35817h;

    static {
        ArrayList arrayList = new ArrayList();
        f35817h = arrayList;
        arrayList.add("UFID");
        f35817h.add("TIT2");
        f35817h.add("TPE1");
        f35817h.add("TALB");
        f35817h.add("TORY");
        f35817h.add("TCON");
        f35817h.add("TCOM");
        f35817h.add("TPE3");
        f35817h.add("TIT1");
        f35817h.add("TRCK");
        f35817h.add("TYER");
        f35817h.add("TDAT");
        f35817h.add("TIME");
        f35817h.add("TBPM");
        f35817h.add("TSRC");
        f35817h.add("TORY");
        f35817h.add("TPE2");
        f35817h.add("TIT3");
        f35817h.add("USLT");
        f35817h.add("TXXX");
        f35817h.add("WXXX");
        f35817h.add("WOAR");
        f35817h.add("WCOM");
        f35817h.add("WCOP");
        f35817h.add("WOAF");
        f35817h.add("WORS");
        f35817h.add("WPAY");
        f35817h.add("WPUB");
        f35817h.add("WCOM");
        f35817h.add("TEXT");
        f35817h.add("TMED");
        f35817h.add("IPLS");
        f35817h.add("TLAN");
        f35817h.add("TSOT");
        f35817h.add("TDLY");
        f35817h.add("PCNT");
        f35817h.add("POPM");
        f35817h.add("TPUB");
        f35817h.add("TSO2");
        f35817h.add("TSOC");
        f35817h.add("TCMP");
        f35817h.add("TSOT");
        f35817h.add("TSOP");
        f35817h.add("TSOA");
        f35817h.add("XSOT");
        f35817h.add("XSOP");
        f35817h.add("XSOA");
        f35817h.add("TSO2");
        f35817h.add("TSOC");
        f35817h.add("COMM");
        f35817h.add("TRDA");
        f35817h.add("COMR");
        f35817h.add("TCOP");
        f35817h.add("TENC");
        f35817h.add("ENCR");
        f35817h.add("EQUA");
        f35817h.add("ETCO");
        f35817h.add("TOWN");
        f35817h.add("TFLT");
        f35817h.add("GRID");
        f35817h.add("TSSE");
        f35817h.add("TKEY");
        f35817h.add("TLEN");
        f35817h.add("LINK");
        f35817h.add("TSIZ");
        f35817h.add("MLLT");
        f35817h.add("TOPE");
        f35817h.add("TOFN");
        f35817h.add("TOLY");
        f35817h.add("TOAL");
        f35817h.add("OWNE");
        f35817h.add("POSS");
        f35817h.add("TRSN");
        f35817h.add("TRSO");
        f35817h.add("RBUF");
        f35817h.add("TPE4");
        f35817h.add("RVRB");
        f35817h.add("TPOS");
        f35817h.add("SYLT");
        f35817h.add("SYTC");
        f35817h.add("USER");
        f35817h.add("APIC");
        f35817h.add("PRIV");
        f35817h.add("MCDI");
        f35817h.add("AENC");
        f35817h.add("GEOB");
    }

    private C9175b0() {
    }

    /* renamed from: b */
    public static C9175b0 m48745b() {
        if (f35816g == null) {
            f35816g = new C9175b0();
        }
        return f35816g;
    }

    /* renamed from: a */
    public int compare(String str, String str2) {
        int indexOf = f35817h.indexOf(str);
        int i = Integer.MAX_VALUE;
        if (indexOf == -1) {
            indexOf = Integer.MAX_VALUE;
        }
        int indexOf2 = f35817h.indexOf(str2);
        if (indexOf2 != -1) {
            i = indexOf2;
        }
        return indexOf == i ? str.compareTo(str2) : indexOf - i;
    }

    public boolean equals(Object obj) {
        return obj instanceof C9175b0;
    }
}
