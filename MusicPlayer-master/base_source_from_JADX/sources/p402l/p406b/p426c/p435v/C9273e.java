package p402l.p406b.p426c.p435v;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p407a.p418k.p419j.C9077c;
import p402l.p406b.p426c.C9132l;
import p402l.p406b.p426c.p435v.p437h.C9279b;

/* renamed from: l.b.c.v.e */
/* compiled from: Mp4TagField */
public abstract class C9273e implements C9132l {

    /* renamed from: i */
    public static Logger f35970i = Logger.getLogger("org.jaudiotagger.tag.mp4");

    /* renamed from: g */
    protected String f35971g;

    /* renamed from: h */
    protected C9077c f35972h;

    protected C9273e(String str) {
        this.f35971g = str;
    }

    /* renamed from: D */
    public String mo31497D() {
        return this.f35971g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo32118a(ByteBuffer byteBuffer) throws UnsupportedEncodingException;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract byte[] mo32119b() throws UnsupportedEncodingException;

    /* renamed from: c */
    public byte[] mo31499c() throws UnsupportedEncodingException {
        Logger logger = f35970i;
        logger.fine("Getting Raw data for:" + mo31497D());
        try {
            byte[] e = mo32121e();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(C9057i.m48311n(e.length + 8));
            byteArrayOutputStream.write(C9057i.m48300c(mo31497D(), "ISO-8859-1"));
            byteArrayOutputStream.write(e);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: d */
    public abstract C9279b mo32120d();

    /* renamed from: e */
    public byte[] mo32121e() throws UnsupportedEncodingException {
        Logger logger = f35970i;
        logger.fine("Getting Raw data for:" + mo31497D());
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] b = mo32119b();
            byteArrayOutputStream.write(C9057i.m48311n(b.length + 16));
            byteArrayOutputStream.write(C9057i.m48300c("data", "ISO-8859-1"));
            byteArrayOutputStream.write(new byte[]{0});
            byteArrayOutputStream.write(new byte[]{0, 0, (byte) mo32120d().getFileClassId()});
            byteArrayOutputStream.write(new byte[]{0, 0, 0, 0});
            byteArrayOutputStream.write(b);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: f */
    public boolean mo31500f() {
        return this.f35971g.equals(C9269a.ARTIST.getFieldName()) || this.f35971g.equals(C9269a.ALBUM.getFieldName()) || this.f35971g.equals(C9269a.TITLE.getFieldName()) || this.f35971g.equals(C9269a.TRACK.getFieldName()) || this.f35971g.equals(C9269a.DAY.getFieldName()) || this.f35971g.equals(C9269a.COMMENT.getFieldName()) || this.f35971g.equals(C9269a.GENRE.getFieldName());
    }

    protected C9273e(C9077c cVar, ByteBuffer byteBuffer) throws UnsupportedEncodingException {
        this.f35972h = cVar;
        mo32118a(byteBuffer);
    }

    protected C9273e(String str, ByteBuffer byteBuffer) throws UnsupportedEncodingException {
        this(str);
        mo32118a(byteBuffer);
    }
}
