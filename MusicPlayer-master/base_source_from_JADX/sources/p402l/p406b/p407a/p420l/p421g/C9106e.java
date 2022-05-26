package p402l.p406b.p407a.p420l.p421g;

import java.util.logging.Logger;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p407a.p420l.C9099f;

/* renamed from: l.b.a.l.g.e */
/* compiled from: VorbisIdentificationHeader */
public class C9106e implements C9105d {

    /* renamed from: h */
    public static Logger f35705h = Logger.getLogger("org.jaudiotagger.audio.ogg.atom");

    /* renamed from: b */
    private int f35706b;

    /* renamed from: c */
    private int f35707c;

    /* renamed from: d */
    private int f35708d;

    /* renamed from: e */
    private int f35709e;

    /* renamed from: f */
    private int f35710f;

    /* renamed from: g */
    private int f35711g;

    public C9106e(byte[] bArr) {
        mo31702a(bArr);
    }

    /* renamed from: h */
    private int m48524h(int i) {
        return i & 255;
    }

    /* renamed from: a */
    public void mo31702a(byte[] bArr) {
        byte b = bArr[0];
        Logger logger = f35705h;
        logger.fine("packetType" + b);
        String q = C9057i.m48314q(bArr, 1, 6, "ISO-8859-1");
        if (b == C9107f.IDENTIFICATION_HEADER.getType() && q.equals("vorbis")) {
            this.f35707c = bArr[7] + (bArr[8] << 8) + (bArr[9] << 16) + (bArr[10] << 24);
            Logger logger2 = f35705h;
            logger2.fine("vorbisVersion" + this.f35707c);
            this.f35706b = m48524h(bArr[11]);
            Logger logger3 = f35705h;
            logger3.fine("audioChannels" + this.f35706b);
            this.f35708d = m48524h(bArr[12]) + (m48524h(bArr[13]) << 8) + (m48524h(bArr[14]) << 16) + (m48524h(bArr[15]) << 24);
            Logger logger4 = f35705h;
            logger4.fine("audioSampleRate" + this.f35708d);
            Logger logger5 = f35705h;
            logger5.fine("audioSampleRate" + bArr[12] + " " + bArr[13] + " " + bArr[14]);
            this.f35709e = m48524h(bArr[16]) + (m48524h(bArr[17]) << 8) + (m48524h(bArr[18]) << 16) + (m48524h(bArr[19]) << 24);
            this.f35710f = m48524h(bArr[20]) + (m48524h(bArr[21]) << 8) + (m48524h(bArr[22]) << 16) + (m48524h(bArr[23]) << 24);
            this.f35711g = m48524h(bArr[24]) + (m48524h(bArr[25]) << 8) + (m48524h(bArr[26]) << 16) + (m48524h(bArr[27]) << 24);
            byte b2 = bArr[29];
            Logger logger6 = f35705h;
            logger6.fine("framingFlag" + b2);
        }
    }

    /* renamed from: b */
    public int mo31703b() {
        return this.f35706b;
    }

    /* renamed from: c */
    public String mo31704c() {
        return C9099f.values()[this.f35707c].toString();
    }

    /* renamed from: d */
    public int mo31705d() {
        return this.f35711g;
    }

    /* renamed from: e */
    public int mo31706e() {
        return this.f35709e;
    }

    /* renamed from: f */
    public int mo31707f() {
        return this.f35710f;
    }

    /* renamed from: g */
    public int mo31708g() {
        return this.f35708d;
    }
}
