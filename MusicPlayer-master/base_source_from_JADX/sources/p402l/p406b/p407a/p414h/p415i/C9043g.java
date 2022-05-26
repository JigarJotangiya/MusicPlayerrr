package p402l.p406b.p407a.p414h.p415i;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p426c.C9123c;
import p402l.p406b.p426c.C9125e;
import p402l.p406b.p426c.C9132l;
import p402l.p406b.p426c.p439x.C9293d;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.a.h.i.g */
/* compiled from: MetadataBlockDataPicture */
public class C9043g implements C9039c, C9132l {

    /* renamed from: o */
    public static Logger f35497o = Logger.getLogger("org.jaudiotagger.audio.flac.MetadataBlockDataPicture");

    /* renamed from: g */
    private int f35498g;

    /* renamed from: h */
    private String f35499h = BuildConfig.FLAVOR;

    /* renamed from: i */
    private String f35500i;

    /* renamed from: j */
    private int f35501j;

    /* renamed from: k */
    private int f35502k;

    /* renamed from: l */
    private int f35503l;

    /* renamed from: m */
    private int f35504m;

    /* renamed from: n */
    private byte[] f35505n;

    public C9043g(C9046j jVar, RandomAccessFile randomAccessFile) throws IOException, C9125e {
        ByteBuffer allocate = ByteBuffer.allocate(jVar.mo31515d());
        int read = randomAccessFile.getChannel().read(allocate);
        if (read >= jVar.mo31515d()) {
            allocate.rewind();
            m48216e(allocate);
            return;
        }
        throw new IOException("Unable to read required number of databytes read:" + read + ":required:" + jVar.mo31515d());
    }

    /* renamed from: d */
    private String m48215d(ByteBuffer byteBuffer, int i, String str) throws IOException {
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        return new String(bArr, str);
    }

    /* renamed from: e */
    private void m48216e(ByteBuffer byteBuffer) throws IOException, C9125e {
        int i = byteBuffer.getInt();
        this.f35498g = i;
        if (i < C9293d.m49282g().mo31791b()) {
            this.f35499h = m48215d(byteBuffer, byteBuffer.getInt(), "ISO-8859-1");
            this.f35500i = m48215d(byteBuffer, byteBuffer.getInt(), "UTF-8");
            this.f35501j = byteBuffer.getInt();
            this.f35502k = byteBuffer.getInt();
            this.f35503l = byteBuffer.getInt();
            this.f35504m = byteBuffer.getInt();
            byte[] bArr = new byte[byteBuffer.getInt()];
            this.f35505n = bArr;
            byteBuffer.get(bArr);
            Logger logger = f35497o;
            logger.config("Read image:" + toString());
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("PictureType was:");
        sb.append(this.f35498g);
        sb.append("but the maximum allowed is ");
        sb.append(C9293d.m49282g().mo31791b() - 1);
        throw new C9125e(sb.toString());
    }

    /* renamed from: D */
    public String mo31497D() {
        return C9123c.COVER_ART.name();
    }

    /* renamed from: a */
    public byte[] mo31496a() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(C9057i.m48311n(this.f35498g));
            byteArrayOutputStream.write(C9057i.m48311n(this.f35499h.length()));
            byteArrayOutputStream.write(this.f35499h.getBytes("ISO-8859-1"));
            byteArrayOutputStream.write(C9057i.m48311n(this.f35500i.length()));
            byteArrayOutputStream.write(this.f35500i.getBytes("UTF-8"));
            byteArrayOutputStream.write(C9057i.m48311n(this.f35501j));
            byteArrayOutputStream.write(C9057i.m48311n(this.f35502k));
            byteArrayOutputStream.write(C9057i.m48311n(this.f35503l));
            byteArrayOutputStream.write(C9057i.m48311n(this.f35504m));
            byteArrayOutputStream.write(C9057i.m48311n(this.f35505n.length));
            byteArrayOutputStream.write(this.f35505n);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /* renamed from: b */
    public int mo31498b() {
        return mo31496a().length;
    }

    /* renamed from: c */
    public byte[] mo31499c() throws UnsupportedEncodingException {
        return mo31496a();
    }

    /* renamed from: f */
    public boolean mo31500f() {
        return true;
    }

    public boolean isEmpty() {
        return false;
    }

    public String toString() {
        return C9293d.m49282g().mo31785f(this.f35498g) + ":" + this.f35499h + ":" + this.f35500i + ":" + "width:" + this.f35501j + ":height:" + this.f35502k + ":colourdepth:" + this.f35503l + ":indexedColourCount:" + this.f35504m + ":image size in bytes:" + this.f35505n.length;
    }
}
