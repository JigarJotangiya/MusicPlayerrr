package p402l.p406b.p426c.p431t;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;
import p402l.p406b.p426c.p429r.C9149d;

/* renamed from: l.b.c.t.k */
/* compiled from: ID3Frames */
public abstract class C9198k extends C9149d {

    /* renamed from: m */
    public static final Map<String, String> f35887m = new LinkedHashMap();

    /* renamed from: n */
    public static final Map<String, String> f35888n = new LinkedHashMap();

    /* renamed from: o */
    public static final Map<String, String> f35889o = new LinkedHashMap();

    /* renamed from: p */
    public static final Map<String, String> f35890p = new LinkedHashMap();

    /* renamed from: q */
    public static final Map<String, String> f35891q = new LinkedHashMap();

    /* renamed from: r */
    public static final Map<String, String> f35892r = new LinkedHashMap();

    /* renamed from: s */
    public static final Map<String, String> f35893s = new LinkedHashMap();

    /* renamed from: t */
    public static final Map<String, String> f35894t = new LinkedHashMap();

    /* renamed from: g */
    protected TreeSet<String> f35895g = new TreeSet<>();

    /* renamed from: h */
    protected TreeSet<String> f35896h = new TreeSet<>();

    /* renamed from: i */
    protected TreeSet<String> f35897i = new TreeSet<>();

    /* renamed from: j */
    protected TreeSet<String> f35898j = new TreeSet<>();

    /* renamed from: k */
    protected TreeSet<String> f35899k = new TreeSet<>();

    /* renamed from: l */
    protected TreeSet<String> f35900l = new TreeSet<>();

    static {
        m48900h();
        m48901i();
    }

    /* renamed from: h */
    private static void m48900h() {
        Map<String, String> map = f35887m;
        map.put("TP2", "TPE2");
        map.put("TAL", "TALB");
        map.put("TP1", "TPE1");
        map.put("CRA", "AENC");
        map.put("TBP", "TBPM");
        map.put("COM", "COMM");
        map.put("COM", "COMM");
        map.put("TCM", "TCOM");
        map.put("TPE", "TPE3");
        map.put("TT1", "TIT1");
        map.put("TCR", "TCOP");
        map.put("TEN", "TENC");
        map.put("EQU", "EQUA");
        map.put("ETC", "ETCO");
        map.put("TFT", "TFLT");
        map.put("GEO", "GEOB");
        map.put("TCO", "TCON");
        map.put("TSS", "TSSE");
        map.put("TKE", "TKEY");
        map.put("IPL", "IPLS");
        map.put("TRC", "TSRC");
        map.put("TLA", "TLAN");
        map.put("TLE", "TLEN");
        map.put("LNK", "LINK");
        map.put("TXT", "TEXT");
        map.put("TMT", "TMED");
        map.put("MLL", "MLLT");
        map.put("MCI", "MCDI");
        map.put("TOA", "TOPE");
        map.put("TOF", "TOFN");
        map.put("TOL", "TOLY");
        map.put("TOT", "TOAL");
        map.put("TDY", "TDLY");
        map.put("CNT", "PCNT");
        map.put("CNT", "PCNT");
        map.put("POP", "POPM");
        map.put("TPB", "TPUB");
        map.put("BUF", "RBUF");
        map.put("BUF", "RBUF");
        map.put("RVA", "RVAD");
        map.put("TP4", "TPE4");
        map.put("REV", "RVRB");
        map.put("TPA", "TPOS");
        map.put("TPS", "TSST");
        map.put("SLT", "SYLT");
        map.put("STC", "SYTC");
        map.put("TDA", "TDAT");
        map.put("TIM", "TIME");
        map.put("TT3", "TIT3");
        map.put("TOR", "TORY");
        map.put("TRK", "TRCK");
        map.put("TRD", "TRDA");
        map.put("TSI", "TSIZ");
        map.put("TYE", "TYER");
        map.put("UFI", "UFID");
        map.put("UFI", "UFID");
        map.put("ULT", "USLT");
        map.put("WAR", "WOAR");
        map.put("WCM", "WCOM");
        map.put("WCP", "WCOP");
        map.put("WAF", "WOAF");
        map.put("WRS", "WORS");
        map.put("WPAY", "WPAY");
        map.put("WPB", "WPUB");
        map.put("WAS", "WOAS");
        map.put("TXX", "TXXX");
        map.put("WXX", "WXXX");
        map.put("TT2", "TIT2");
        map.put("TCP", "TCMP");
        map.put("TST", "TSOT");
        map.put("TSP", "TSOP");
        map.put("TSA", "TSOA");
        map.put("TS2", "TSO2");
        map.put("TSC", "TSOC");
        for (String next : map.keySet()) {
            f35888n.put(f35887m.get(next), next);
        }
        Map<String, String> map2 = f35888n;
        map2.put("XSOT", "TST");
        map2.put("XSOP", "TSP");
        map2.put("XSOA", "TSA");
        f35889o.put("PIC", "APIC");
        f35890p.put("APIC", "PIC");
    }

    /* renamed from: i */
    private static void m48901i() {
        Map<String, String> map = f35891q;
        map.put("XSOT", "TSOT");
        map.put("XSOP", "TSOP");
        map.put("XSOA", "TSOA");
        Map<String, String> map2 = f35893s;
        map2.put("RVAD", "RVA2");
        map2.put("EQUA", "EQU2");
        map2.put("IPLS", "TIPL");
        map2.put("TDAT", "TDRC");
        map2.put("TIME", "TDRC");
        map2.put("TORY", "TDOR");
        map2.put("TRDA", "TDRC");
        map2.put("TYER", "TDRC");
        map2.put("TYER", "TDRC");
        Map<String, String> map3 = f35894t;
        map3.put("RVA2", "RVAD");
        map3.put("TIPL", "IPLS");
        map3.put("TMOO", "TXXX");
        map3.put("TDOR", "TORY");
    }

    /* renamed from: e */
    public boolean mo31958e(String str) {
        return this.f35899k.contains(str);
    }

    /* renamed from: f */
    public boolean mo31959f(String str) {
        return this.f35896h.contains(str);
    }

    /* renamed from: g */
    public boolean mo31960g(String str) {
        return this.f35895g.contains(str);
    }
}
