package p402l.p406b.p426c.p431t;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import p402l.p406b.p407a.p416i.C9057i;
import p402l.p406b.p425b.C9118b;
import p402l.p406b.p426c.C9123c;
import p402l.p406b.p426c.C9132l;
import p402l.p406b.p426c.C9133m;
import p402l.p406b.p426c.C9134n;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: l.b.c.t.p */
/* compiled from: ID3v11Tag */
public class C9241p extends C9244r {

    /* renamed from: t */
    protected byte f35932t = 0;

    /* renamed from: l.b.c.t.p$a */
    /* compiled from: ID3v11Tag */
    static /* synthetic */ class C9242a {

        /* renamed from: a */
        static final /* synthetic */ int[] f35933a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                l.b.c.c[] r0 = p402l.p406b.p426c.C9123c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35933a = r0
                l.b.c.c r1 = p402l.p406b.p426c.C9123c.ARTIST     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f35933a     // Catch:{ NoSuchFieldError -> 0x001d }
                l.b.c.c r1 = p402l.p406b.p426c.C9123c.ALBUM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f35933a     // Catch:{ NoSuchFieldError -> 0x0028 }
                l.b.c.c r1 = p402l.p406b.p426c.C9123c.TITLE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f35933a     // Catch:{ NoSuchFieldError -> 0x0033 }
                l.b.c.c r1 = p402l.p406b.p426c.C9123c.GENRE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f35933a     // Catch:{ NoSuchFieldError -> 0x003e }
                l.b.c.c r1 = p402l.p406b.p426c.C9123c.YEAR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f35933a     // Catch:{ NoSuchFieldError -> 0x0049 }
                l.b.c.c r1 = p402l.p406b.p426c.C9123c.TRACK     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f35933a     // Catch:{ NoSuchFieldError -> 0x0054 }
                l.b.c.c r1 = p402l.p406b.p426c.C9123c.COMMENT     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p402l.p406b.p426c.p431t.C9241p.C9242a.<clinit>():void");
        }
    }

    public C9241p() {
    }

    /* renamed from: G */
    public boolean mo32034G(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[3];
        byteBuffer.get(bArr, 0, 3);
        if (!Arrays.equals(bArr, C9174b.f35815l)) {
            return false;
        }
        byteBuffer.position(125);
        if (byteBuffer.get() == 0 && byteBuffer.get() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public void mo32035J(String str) {
        if (str != null) {
            this.f35938o = C9238m.m49076o(str, 28);
            return;
        }
        throw new IllegalArgumentException(C9118b.GENERAL_INVALID_NULL_ARGUMENT.getMsg());
    }

    /* renamed from: K */
    public void mo32036K(C9132l lVar) {
        if (C9123c.valueOf(lVar.mo31497D()) == C9123c.TRACK) {
            mo32039Q(lVar.toString());
        } else {
            super.mo32036K(lVar);
        }
    }

    /* renamed from: O */
    public String mo32037O() {
        return String.valueOf(this.f35932t & 255);
    }

    /* renamed from: P */
    public List<C9132l> mo32038P() {
        C9123c cVar = C9123c.TRACK;
        if (mo32040u(cVar).length() > 0) {
            return mo32046F(new C9246s(C9243q.TRACK.name(), mo32040u(cVar)));
        }
        return new ArrayList();
    }

    /* renamed from: Q */
    public void mo32039Q(String str) {
        int i;
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            i = 0;
        }
        if (i > 255 || i < 1) {
            this.f35932t = 0;
        } else {
            this.f35932t = (byte) Integer.parseInt(str);
        }
    }

    /* renamed from: a */
    public List<C9132l> mo31559a(C9123c cVar) {
        if (cVar == C9123c.TRACK) {
            return mo32038P();
        }
        return super.mo31559a(cVar);
    }

    /* renamed from: b */
    public int mo31518b() {
        return 7;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C9241p) && this.f35932t == ((C9241p) obj).f35932t && super.equals(obj)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public void mo31887i(ByteBuffer byteBuffer) throws C9133m {
        if (mo32034G(byteBuffer)) {
            C9174b.f35813j.finer("Reading v1.1 tag");
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
            if (matcher3.find()) {
                this.f35936m = this.f35936m.substring(0, matcher3.start());
            }
            String trim4 = C9057i.m48314q(bArr, 93, 4, "ISO-8859-1").trim();
            this.f35940q = trim4;
            Matcher matcher4 = C9174b.f35814k.matcher(trim4);
            if (matcher4.find()) {
                this.f35940q = this.f35940q.substring(0, matcher4.start());
            }
            String trim5 = C9057i.m48314q(bArr, 97, 28, "ISO-8859-1").trim();
            this.f35938o = trim5;
            Matcher matcher5 = C9174b.f35814k.matcher(trim5);
            if (matcher5.find()) {
                this.f35938o = this.f35938o.substring(0, matcher5.start());
            }
            this.f35932t = bArr[126];
            this.f35941r = bArr[127];
            return;
        }
        throw new C9133m("ID3v1 tag not found");
    }

    public boolean isEmpty() {
        return this.f35932t <= 0 && super.isEmpty();
    }

    /* renamed from: j */
    public void mo31917j(RandomAccessFile randomAccessFile) throws IOException {
        C9174b.f35813j.config("Saving ID3v11 tag to file");
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
            String o5 = C9238m.m49076o(this.f35938o, 28);
            for (int i5 = 0; i5 < o5.length(); i5++) {
                bArr[i5 + 97] = (byte) o5.charAt(i5);
            }
        }
        bArr[126] = this.f35932t;
        if (C9134n.m48562h().mo31748s()) {
            bArr[127] = this.f35941r;
        }
        randomAccessFile.write(bArr);
        C9174b.f35813j.config("Saved ID3v11 tag to file");
    }

    /* renamed from: u */
    public String mo32040u(C9123c cVar) {
        switch (C9242a.f35933a[cVar.ordinal()]) {
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
                return mo32037O();
            case 7:
                return mo32041x();
            default:
                return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: x */
    public String mo32041x() {
        return this.f35938o;
    }

    public C9241p(RandomAccessFile randomAccessFile, String str) throws C9133m, IOException {
        mo31850n(str);
        ByteBuffer allocate = ByteBuffer.allocate(128);
        FileChannel channel = randomAccessFile.getChannel();
        channel.position(randomAccessFile.length() - 128);
        channel.read(allocate);
        allocate.flip();
        mo31887i(allocate);
    }
}
