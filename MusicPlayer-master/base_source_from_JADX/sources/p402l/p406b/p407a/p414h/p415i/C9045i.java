package p402l.p406b.p407a.p414h.p415i;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

/* renamed from: l.b.a.h.i.i */
/* compiled from: MetadataBlockDataStreamInfo */
public class C9045i implements C9039c {

    /* renamed from: t */
    public static Logger f35507t = Logger.getLogger("org.jaudiotagger.audio.flac.MetadataBlockDataStreamInfo");

    /* renamed from: g */
    private int f35508g;

    /* renamed from: h */
    private int f35509h;

    /* renamed from: i */
    private int f35510i;

    /* renamed from: j */
    private int f35511j;

    /* renamed from: k */
    private int f35512k;

    /* renamed from: l */
    private int f35513l;

    /* renamed from: m */
    private int f35514m;

    /* renamed from: n */
    private int f35515n;

    /* renamed from: o */
    private int f35516o;

    /* renamed from: p */
    private float f35517p;

    /* renamed from: q */
    private String f35518q;

    /* renamed from: r */
    private boolean f35519r = true;

    /* renamed from: s */
    private ByteBuffer f35520s;

    public C9045i(C9046j jVar, RandomAccessFile randomAccessFile) throws IOException {
        this.f35520s = ByteBuffer.allocate(jVar.mo31515d());
        int read = randomAccessFile.getChannel().read(this.f35520s);
        if (read >= jVar.mo31515d()) {
            this.f35520s.rewind();
            this.f35508g = this.f35520s.getShort();
            this.f35509h = this.f35520s.getShort();
            this.f35510i = m48224k(this.f35520s.get(), this.f35520s.get(), this.f35520s.get());
            this.f35511j = m48224k(this.f35520s.get(), this.f35520s.get(), this.f35520s.get());
            this.f35512k = m48223j(this.f35520s.get(), this.f35520s.get(), this.f35520s.get());
            int m = ((m48226m(this.f35520s.get(12)) & 14) >>> 1) + 1;
            this.f35515n = m;
            this.f35513l = this.f35512k / m;
            this.f35514m = ((m48226m(this.f35520s.get(12)) & 1) << 4) + ((m48226m(this.f35520s.get(13)) & 240) >>> 4) + 1;
            this.f35516o = m48225l(this.f35520s.get(13), this.f35520s.get(14), this.f35520s.get(15), this.f35520s.get(16), this.f35520s.get(17));
            StringBuilder sb = new StringBuilder();
            for (int i = 18; i < 34; i++) {
                sb.append(String.format("%x", new Object[]{Byte.valueOf(this.f35520s.get(i))}));
            }
            this.f35518q = sb.toString();
            this.f35517p = (float) (((double) this.f35516o) / ((double) this.f35512k));
            f35507t.config(toString());
            return;
        }
        throw new IOException("Unable to read required number of databytes read:" + read + ":required:" + jVar.mo31515d());
    }

    /* renamed from: j */
    private int m48223j(byte b, byte b2, byte b3) {
        return (m48226m(b) << 12) + (m48226m(b2) << 4) + ((m48226m(b3) & 240) >>> 4);
    }

    /* renamed from: k */
    private int m48224k(byte b, byte b2, byte b3) {
        return (m48226m(b) << 16) + (m48226m(b2) << 8) + m48226m(b3);
    }

    /* renamed from: l */
    private int m48225l(byte b, byte b2, byte b3, byte b4, byte b5) {
        return m48226m(b5) + (m48226m(b4) << 8) + (m48226m(b3) << 16) + (m48226m(b2) << 24) + ((m48226m(b) & 15) << 32);
    }

    /* renamed from: m */
    private int m48226m(int i) {
        return i & 255;
    }

    /* renamed from: a */
    public byte[] mo31496a() {
        return this.f35520s.array();
    }

    /* renamed from: b */
    public int mo31503b() {
        return this.f35514m;
    }

    /* renamed from: c */
    public int mo31504c() {
        return this.f35515n;
    }

    /* renamed from: d */
    public String mo31505d() {
        return "FLAC " + this.f35514m + " bits";
    }

    /* renamed from: e */
    public String mo31506e() {
        return this.f35518q;
    }

    /* renamed from: f */
    public float mo31507f() {
        return this.f35517p;
    }

    /* renamed from: g */
    public int mo31508g() {
        return this.f35512k;
    }

    /* renamed from: h */
    public int mo31509h() {
        return (int) this.f35517p;
    }

    /* renamed from: i */
    public boolean mo31510i() {
        return this.f35519r;
    }

    public String toString() {
        return "MinBlockSize:" + this.f35508g + "MaxBlockSize:" + this.f35509h + "MinFrameSize:" + this.f35510i + "MaxFrameSize:" + this.f35511j + "SampleRateTotal:" + this.f35512k + "SampleRatePerChannel:" + this.f35513l + ":Channel number:" + this.f35515n + ":Bits per sample: " + this.f35514m + ":TotalNumberOfSamples: " + this.f35516o + ":Length: " + this.f35517p;
    }
}
