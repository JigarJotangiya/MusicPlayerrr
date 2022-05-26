package p402l.p406b.p426c.p431t;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.C9122b;
import p402l.p406b.p426c.C9123c;
import p402l.p406b.p426c.C9128h;
import p402l.p406b.p426c.C9130j;
import p402l.p406b.p426c.C9132l;
import p402l.p406b.p426c.C9133m;
import p402l.p406b.p426c.C9134n;
import p402l.p406b.p426c.p439x.C9290a;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.t.r */
/* compiled from: ID3v1Tag */
public class C9244r extends C9174b implements C9130j {

    /* renamed from: s */
    static EnumMap<C9123c, C9243q> f35935s;

    /* renamed from: m */
    protected String f35936m = BuildConfig.FLAVOR;

    /* renamed from: n */
    protected String f35937n = BuildConfig.FLAVOR;

    /* renamed from: o */
    protected String f35938o = BuildConfig.FLAVOR;

    /* renamed from: p */
    protected String f35939p = BuildConfig.FLAVOR;

    /* renamed from: q */
    protected String f35940q = BuildConfig.FLAVOR;

    /* renamed from: r */
    protected byte f35941r = -1;

    /* renamed from: l.b.c.t.r$a */
    /* compiled from: ID3v1Tag */
    static /* synthetic */ class C9245a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35942a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                l.b.c.c[] r0 = p402l.p406b.p426c.C9123c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35942a = r0
                l.b.c.c r1 = p402l.p406b.p426c.C9123c.ARTIST     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35942a     // Catch:{ NoSuchFieldError -> 0x001d }
                l.b.c.c r1 = p402l.p406b.p426c.C9123c.ALBUM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35942a     // Catch:{ NoSuchFieldError -> 0x0028 }
                l.b.c.c r1 = p402l.p406b.p426c.C9123c.TITLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f35942a     // Catch:{ NoSuchFieldError -> 0x0033 }
                l.b.c.c r1 = p402l.p406b.p426c.C9123c.GENRE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f35942a     // Catch:{ NoSuchFieldError -> 0x003e }
                l.b.c.c r1 = p402l.p406b.p426c.C9123c.YEAR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f35942a     // Catch:{ NoSuchFieldError -> 0x0049 }
                l.b.c.c r1 = p402l.p406b.p426c.C9123c.COMMENT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p402l.p406b.p426c.p431t.C9244r.C9245a.<clinit>():void");
        }
    }

    static {
        EnumMap<C9123c, C9243q> enumMap = new EnumMap<>(C9123c.class);
        f35935s = enumMap;
        enumMap.put(C9123c.ARTIST, C9243q.ARTIST);
        f35935s.put(C9123c.ALBUM, C9243q.ALBUM);
        f35935s.put(C9123c.TITLE, C9243q.TITLE);
        f35935s.put(C9123c.TRACK, C9243q.TRACK);
        f35935s.put(C9123c.YEAR, C9243q.YEAR);
        f35935s.put(C9123c.GENRE, C9243q.GENRE);
        f35935s.put(C9123c.COMMENT, C9243q.COMMENT);
    }

    public C9244r() {
    }

    /* renamed from: A */
    public String mo32042A() {
        return this.f35940q;
    }

    /* renamed from: B */
    public List<C9132l> mo32043B() {
        C9123c cVar = C9123c.GENRE;
        if (mo32040u(cVar).length() > 0) {
            return mo32046F(new C9246s(C9243q.GENRE.name(), mo32040u(cVar)));
        }
        return new ArrayList();
    }

    /* renamed from: C */
    public List<C9132l> mo32044C() {
        C9123c cVar = C9123c.TITLE;
        if (mo32040u(cVar).length() > 0) {
            return mo32046F(new C9246s(C9243q.TITLE.name(), mo32040u(cVar)));
        }
        return new ArrayList();
    }

    /* renamed from: E */
    public List<C9132l> mo32045E() {
        C9123c cVar = C9123c.YEAR;
        if (mo32040u(cVar).length() > 0) {
            return mo32046F(new C9246s(C9243q.YEAR.name(), mo32040u(cVar)));
        }
        return new ArrayList();
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public List<C9132l> mo32046F(C9246s sVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(sVar);
        return arrayList;
    }

    /* renamed from: G */
    public boolean mo32034G(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[3];
        byteBuffer.get(bArr, 0, 3);
        return Arrays.equals(bArr, C9174b.f35815l);
    }

    /* renamed from: H */
    public void mo32047H(String str) {
        if (str != null) {
            this.f35936m = C9238m.m49076o(str, 30);
            return;
        }
        throw new IllegalArgumentException(C9118b.GENERAL_INVALID_NULL_ARGUMENT.getMsg());
    }

    /* renamed from: I */
    public void mo32048I(String str) {
        if (str != null) {
            this.f35937n = C9238m.m49076o(str, 30);
            return;
        }
        throw new IllegalArgumentException(C9118b.GENERAL_INVALID_NULL_ARGUMENT.getMsg());
    }

    /* renamed from: J */
    public void mo32035J(String str) {
        if (str != null) {
            this.f35938o = C9238m.m49076o(str, 30);
            return;
        }
        throw new IllegalArgumentException(C9118b.GENERAL_INVALID_NULL_ARGUMENT.getMsg());
    }

    /* renamed from: K */
    public void mo32036K(C9132l lVar) {
        switch (C9245a.f35942a[C9123c.valueOf(lVar.mo31497D()).ordinal()]) {
            case 1:
                mo32048I(lVar.toString());
                return;
            case 2:
                mo32047H(lVar.toString());
                return;
            case 3:
                mo32050M(lVar.toString());
                return;
            case 4:
                mo32049L(lVar.toString());
                return;
            case 5:
                mo32051N(lVar.toString());
                return;
            case 6:
                mo32035J(lVar.toString());
                return;
            default:
                return;
        }
    }

    /* renamed from: L */
    public void mo32049L(String str) {
        if (str != null) {
            Integer e = C9290a.m49277h().mo31784e(str);
            if (e != null) {
                this.f35941r = e.byteValue();
            } else {
                this.f35941r = -1;
            }
        } else {
            throw new IllegalArgumentException(C9118b.GENERAL_INVALID_NULL_ARGUMENT.getMsg());
        }
    }

    /* renamed from: M */
    public void mo32050M(String str) {
        if (str != null) {
            this.f35939p = C9238m.m49076o(str, 30);
            return;
        }
        throw new IllegalArgumentException(C9118b.GENERAL_INVALID_NULL_ARGUMENT.getMsg());
    }

    /* renamed from: N */
    public void mo32051N(String str) {
        this.f35940q = C9238m.m49076o(str, 4);
    }

    /* renamed from: a */
    public List<C9132l> mo31559a(C9123c cVar) {
        switch (C9245a.f35942a[cVar.ordinal()]) {
            case 1:
                return mo32054s();
            case 2:
                return mo32053r();
            case 3:
                return mo32044C();
            case 4:
                return mo32043B();
            case 5:
                return mo32045E();
            case 6:
                return mo32055t();
            default:
                return new ArrayList();
        }
    }

    /* renamed from: b */
    public int mo31518b() {
        return 6;
    }

    /* renamed from: d */
    public Iterator<C9132l> mo31520d() {
        throw new UnsupportedOperationException("TODO:Not done yet");
    }

    /* renamed from: e */
    public void mo31521e(C9123c cVar, String str) throws C9128h, C9122b {
        mo32036K(mo32052q(cVar, str));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9244r)) {
            return false;
        }
        C9244r rVar = (C9244r) obj;
        if (this.f35936m.equals(rVar.f35936m) && this.f35937n.equals(rVar.f35937n) && this.f35938o.equals(rVar.f35938o) && this.f35941r == rVar.f35941r && this.f35939p.equals(rVar.f35939p) && this.f35940q.equals(rVar.f35940q) && super.equals(obj)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public void mo31887i(ByteBuffer byteBuffer) throws C9133m {
        if (mo32034G(byteBuffer)) {
            Logger logger = C9174b.f35813j;
            logger.finer(mo31847k() + ":" + "Reading v1 tag");
            byte[] bArr = new byte[128];
            byteBuffer.position(0);
            byteBuffer.get(bArr, 0, 128);
            String trim = C9057i.m48314q(bArr, 3, 30, "ISO-8859-1").trim();
            this.f35939p = trim;
            Matcher matcher = C9174b.f35814k.matcher(trim);
            if (matcher.find()) {
                this.f35939p = this.f35939p.substring(0, matcher.start());
            }
            String trim2 = C9057i.m48314q(bArr, 33, 30, "ISO-8859-1").trim();
            this.f35937n = trim2;
            Matcher matcher2 = C9174b.f35814k.matcher(trim2);
            if (matcher2.find()) {
                this.f35937n = this.f35937n.substring(0, matcher2.start());
            }
            String trim3 = C9057i.m48314q(bArr, 63, 30, "ISO-8859-1").trim();
            this.f35936m = trim3;
            Matcher matcher3 = C9174b.f35814k.matcher(trim3);
            Logger logger2 = C9174b.f35813j;
            logger2.finest(mo31847k() + ":" + "Orig Album is:" + this.f35938o + ":");
            if (matcher3.find()) {
                this.f35936m = this.f35936m.substring(0, matcher3.start());
                Logger logger3 = C9174b.f35813j;
                logger3.finest(mo31847k() + ":" + "Album is:" + this.f35936m + ":");
            }
            String trim4 = C9057i.m48314q(bArr, 93, 4, "ISO-8859-1").trim();
            this.f35940q = trim4;
            Matcher matcher4 = C9174b.f35814k.matcher(trim4);
            if (matcher4.find()) {
                this.f35940q = this.f35940q.substring(0, matcher4.start());
            }
            String trim5 = C9057i.m48314q(bArr, 97, 30, "ISO-8859-1").trim();
            this.f35938o = trim5;
            Matcher matcher5 = C9174b.f35814k.matcher(trim5);
            Logger logger4 = C9174b.f35813j;
            logger4.finest(mo31847k() + ":" + "Orig Comment is:" + this.f35938o + ":");
            if (matcher5.find()) {
                this.f35938o = this.f35938o.substring(0, matcher5.start());
                Logger logger5 = C9174b.f35813j;
                logger5.finest(mo31847k() + ":" + "Comment is:" + this.f35938o + ":");
            }
            this.f35941r = bArr[127];
            return;
        }
        throw new C9133m(mo31847k() + ":" + "ID3v1 tag not found");
    }

    public boolean isEmpty() {
        return mo32040u(C9123c.TITLE).length() <= 0 && mo32057w().length() <= 0 && mo32056v().length() <= 0 && mo32040u(C9123c.GENRE).length() <= 0 && mo32040u(C9123c.YEAR).length() <= 0 && mo32041x().length() <= 0;
    }

    /* renamed from: j */
    public void mo31917j(RandomAccessFile randomAccessFile) throws IOException {
        C9174b.f35813j.config("Saving ID3v1 tag to file");
        byte[] bArr = new byte[128];
        mo31852o(randomAccessFile);
        randomAccessFile.seek(randomAccessFile.length());
        byte[] bArr2 = C9174b.f35815l;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        if (C9134n.m48562h().mo31749t()) {
            String o = C9238m.m49076o(this.f35939p, 30);
            for (int i = 0; i < o.length(); i++) {
                bArr[i + 3] = (byte) o.charAt(i);
            }
        }
        if (C9134n.m48562h().mo31746q()) {
            String o2 = C9238m.m49076o(this.f35937n, 30);
            for (int i2 = 0; i2 < o2.length(); i2++) {
                bArr[i2 + 33] = (byte) o2.charAt(i2);
            }
        }
        if (C9134n.m48562h().mo31745p()) {
            String o3 = C9238m.m49076o(this.f35936m, 30);
            for (int i3 = 0; i3 < o3.length(); i3++) {
                bArr[i3 + 63] = (byte) o3.charAt(i3);
            }
        }
        if (C9134n.m48562h().mo31750u()) {
            String o4 = C9238m.m49076o(this.f35940q, 4);
            for (int i4 = 0; i4 < o4.length(); i4++) {
                bArr[i4 + 93] = (byte) o4.charAt(i4);
            }
        }
        if (C9134n.m48562h().mo31747r()) {
            String o5 = C9238m.m49076o(this.f35938o, 30);
            for (int i5 = 0; i5 < o5.length(); i5++) {
                bArr[i5 + 97] = (byte) o5.charAt(i5);
            }
        }
        if (C9134n.m48562h().mo31748s()) {
            bArr[127] = this.f35941r;
        }
        randomAccessFile.write(bArr);
        C9174b.f35813j.config("Saved ID3v1 tag to file");
    }

    /* renamed from: q */
    public C9132l mo32052q(C9123c cVar, String str) {
        if (cVar != null) {
            C9243q qVar = f35935s.get(cVar);
            if (qVar != null) {
                return new C9246s(qVar.name(), str);
            }
            throw new C9128h(C9118b.INVALID_FIELD_FOR_ID3V1TAG.getMsg(cVar.name()));
        }
        throw new IllegalArgumentException(C9118b.GENERAL_INVALID_NULL_ARGUMENT.getMsg());
    }

    /* renamed from: r */
    public List<C9132l> mo32053r() {
        if (mo32056v().length() > 0) {
            return mo32046F(new C9246s(C9243q.ALBUM.name(), mo32056v()));
        }
        return new ArrayList();
    }

    /* renamed from: s */
    public List<C9132l> mo32054s() {
        if (mo32057w().length() > 0) {
            return mo32046F(new C9246s(C9243q.ARTIST.name(), mo32057w()));
        }
        return new ArrayList();
    }

    /* renamed from: t */
    public List<C9132l> mo32055t() {
        if (mo32041x().length() > 0) {
            return mo32046F(new C9246s(C9243q.COMMENT.name(), mo32041x()));
        }
        return new ArrayList();
    }

    /* renamed from: u */
    public String mo32040u(C9123c cVar) {
        switch (C9245a.f35942a[cVar.ordinal()]) {
            case 1:
                return mo32057w();
            case 2:
                return mo32056v();
            case 3:
                return mo32059z();
            case 4:
                return mo32058y();
            case 5:
                return mo32042A();
            case 6:
                return mo32041x();
            default:
                return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: v */
    public String mo32056v() {
        return this.f35936m;
    }

    /* renamed from: w */
    public String mo32057w() {
        return this.f35937n;
    }

    /* renamed from: x */
    public String mo32041x() {
        return this.f35938o;
    }

    /* renamed from: y */
    public String mo32058y() {
        String f = C9290a.m49277h().mo31785f(Integer.valueOf(this.f35941r & 255).intValue());
        return f == null ? BuildConfig.FLAVOR : f;
    }

    /* renamed from: z */
    public String mo32059z() {
        return this.f35939p;
    }

    public C9244r(RandomAccessFile randomAccessFile, String str) throws C9133m, IOException {
        mo31850n(str);
        FileChannel channel = randomAccessFile.getChannel();
        channel.position(randomAccessFile.length() - 128);
        ByteBuffer allocate = ByteBuffer.allocate(128);
        channel.read(allocate);
        allocate.flip();
        mo31887i(allocate);
    }
}
