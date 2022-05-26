package p402l.p406b.p407a.p417j;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import p402l.p406b.p407a.p413g.C9018d;
import p402l.p406b.p425b.C9117a;

/* renamed from: l.b.a.j.f */
/* compiled from: MPEGFrameHeader */
public class C9063f {

    /* renamed from: A */
    private static final Map<Integer, Integer> f35557A;

    /* renamed from: B */
    private static final Map<Integer, Integer> f35558B;

    /* renamed from: C */
    private static final Map<Integer, Map<Integer, Integer>> f35559C;

    /* renamed from: D */
    private static final Map<Integer, Integer> f35560D;

    /* renamed from: E */
    private static final Map<Integer, Integer> f35561E;

    /* renamed from: F */
    private static final Map<Integer, Integer> f35562F;

    /* renamed from: q */
    private static final byte[] f35563q = new byte[4];

    /* renamed from: r */
    public static final Map<Integer, String> f35564r;

    /* renamed from: s */
    public static final Map<Integer, String> f35565s;

    /* renamed from: t */
    private static final Map<Integer, Integer> f35566t;

    /* renamed from: u */
    public static final Map<Integer, String> f35567u;

    /* renamed from: v */
    private static final Map<Integer, String> f35568v;

    /* renamed from: w */
    private static final Map<Integer, String> f35569w;

    /* renamed from: x */
    private static final Map<Integer, String> f35570x;

    /* renamed from: y */
    private static final Map<Integer, Map<Integer, Integer>> f35571y;

    /* renamed from: z */
    private static final Map<Integer, Integer> f35572z;

    /* renamed from: a */
    private byte[] f35573a;

    /* renamed from: b */
    private int f35574b;

    /* renamed from: c */
    private String f35575c;

    /* renamed from: d */
    private int f35576d;

    /* renamed from: e */
    private String f35577e;

    /* renamed from: f */
    private Integer f35578f;

    /* renamed from: g */
    private int f35579g;

    /* renamed from: h */
    private String f35580h;

    /* renamed from: i */
    private int f35581i;

    /* renamed from: j */
    private String f35582j;

    /* renamed from: k */
    private String f35583k;

    /* renamed from: l */
    private boolean f35584l;

    /* renamed from: m */
    private boolean f35585m;

    /* renamed from: n */
    private boolean f35586n;

    /* renamed from: o */
    private boolean f35587o;

    /* renamed from: p */
    private Integer f35588p;

    static {
        HashMap hashMap = new HashMap();
        f35564r = hashMap;
        hashMap.put(0, "MPEG-2.5");
        hashMap.put(2, "MPEG-2");
        hashMap.put(3, "MPEG-1");
        HashMap hashMap2 = new HashMap();
        f35565s = hashMap2;
        hashMap2.put(3, "Layer 1");
        hashMap2.put(2, "Layer 2");
        hashMap2.put(1, "Layer 3");
        HashMap hashMap3 = new HashMap();
        f35566t = hashMap3;
        hashMap3.put(30, 32);
        hashMap3.put(46, 64);
        hashMap3.put(62, 96);
        hashMap3.put(78, 128);
        hashMap3.put(94, 160);
        hashMap3.put(110, 192);
        hashMap3.put(126, 224);
        hashMap3.put(142, 256);
        hashMap3.put(158, 288);
        hashMap3.put(174, 320);
        hashMap3.put(190, 352);
        hashMap3.put(206, 384);
        hashMap3.put(222, 416);
        hashMap3.put(238, 448);
        hashMap3.put(28, 32);
        hashMap3.put(44, 48);
        hashMap3.put(60, 56);
        hashMap3.put(76, 64);
        hashMap3.put(92, 80);
        hashMap3.put(108, 96);
        hashMap3.put(124, 112);
        hashMap3.put(140, 128);
        hashMap3.put(156, 160);
        hashMap3.put(172, 192);
        hashMap3.put(188, 224);
        hashMap3.put(204, 256);
        hashMap3.put(220, 320);
        hashMap3.put(236, 384);
        hashMap3.put(26, 32);
        hashMap3.put(42, 40);
        hashMap3.put(58, 48);
        hashMap3.put(74, 56);
        hashMap3.put(90, 64);
        hashMap3.put(106, 80);
        hashMap3.put(122, 96);
        hashMap3.put(138, 112);
        hashMap3.put(154, 128);
        hashMap3.put(170, 160);
        hashMap3.put(186, 192);
        hashMap3.put(202, 224);
        hashMap3.put(218, 256);
        hashMap3.put(234, 320);
        hashMap3.put(22, 32);
        hashMap3.put(38, 48);
        hashMap3.put(54, 56);
        hashMap3.put(70, 64);
        hashMap3.put(86, 80);
        hashMap3.put(102, 96);
        hashMap3.put(118, 112);
        hashMap3.put(134, 128);
        hashMap3.put(150, 144);
        hashMap3.put(166, 160);
        hashMap3.put(182, 176);
        hashMap3.put(198, 192);
        hashMap3.put(214, 224);
        hashMap3.put(230, 256);
        hashMap3.put(20, 8);
        hashMap3.put(36, 16);
        hashMap3.put(52, 24);
        hashMap3.put(68, 32);
        hashMap3.put(84, 40);
        hashMap3.put(100, 48);
        hashMap3.put(116, 56);
        hashMap3.put(132, 64);
        hashMap3.put(148, 80);
        hashMap3.put(164, 96);
        hashMap3.put(180, 112);
        hashMap3.put(196, 128);
        hashMap3.put(212, 144);
        hashMap3.put(228, 160);
        hashMap3.put(18, 8);
        hashMap3.put(34, 16);
        hashMap3.put(50, 24);
        hashMap3.put(66, 32);
        hashMap3.put(82, 40);
        hashMap3.put(98, 48);
        hashMap3.put(114, 56);
        hashMap3.put(130, 64);
        hashMap3.put(146, 80);
        hashMap3.put(162, 96);
        hashMap3.put(178, 112);
        hashMap3.put(194, 128);
        hashMap3.put(210, 144);
        hashMap3.put(226, 160);
        HashMap hashMap4 = new HashMap();
        f35567u = hashMap4;
        hashMap4.put(0, "Stereo");
        hashMap4.put(1, "Joint Stereo");
        hashMap4.put(2, "Dual");
        hashMap4.put(3, "Mono");
        HashMap hashMap5 = new HashMap();
        f35568v = hashMap5;
        hashMap5.put(0, "None");
        hashMap5.put(1, "5015MS");
        hashMap5.put(2, "Reserved");
        hashMap5.put(3, "CCITT");
        HashMap hashMap6 = new HashMap();
        f35569w = hashMap6;
        HashMap hashMap7 = new HashMap();
        f35570x = hashMap7;
        hashMap6.put(0, "4-31");
        hashMap6.put(1, "8-31");
        hashMap6.put(2, "12-31");
        hashMap6.put(3, "16-31");
        hashMap7.put(0, "off-off");
        hashMap7.put(1, "on-off");
        hashMap7.put(2, "off-on");
        hashMap7.put(3, "on-on");
        HashMap hashMap8 = new HashMap();
        f35571y = hashMap8;
        HashMap hashMap9 = new HashMap();
        f35572z = hashMap9;
        HashMap hashMap10 = new HashMap();
        f35557A = hashMap10;
        HashMap hashMap11 = new HashMap();
        f35558B = hashMap11;
        hashMap9.put(0, 44100);
        hashMap9.put(1, 48000);
        hashMap9.put(2, 32000);
        hashMap10.put(0, 22050);
        hashMap10.put(1, 24000);
        hashMap10.put(2, 16000);
        hashMap11.put(0, 11025);
        hashMap11.put(1, 12000);
        hashMap11.put(2, 8000);
        hashMap8.put(3, hashMap9);
        hashMap8.put(2, hashMap10);
        hashMap8.put(0, hashMap11);
        HashMap hashMap12 = new HashMap();
        f35559C = hashMap12;
        HashMap hashMap13 = new HashMap();
        f35560D = hashMap13;
        HashMap hashMap14 = new HashMap();
        f35561E = hashMap14;
        HashMap hashMap15 = new HashMap();
        f35562F = hashMap15;
        hashMap13.put(3, 384);
        hashMap13.put(2, 1152);
        hashMap13.put(1, 1152);
        hashMap14.put(3, 384);
        hashMap14.put(2, 1152);
        hashMap14.put(1, 1152);
        hashMap15.put(3, 384);
        hashMap15.put(2, 1152);
        hashMap15.put(1, 1152);
        hashMap12.put(3, hashMap13);
        hashMap12.put(2, hashMap14);
        hashMap12.put(0, hashMap15);
    }

    private C9063f(byte[] bArr) throws C9018d {
        this.f35573a = bArr;
        m48364p();
        m48361A();
        m48368t();
        m48373y();
        m48374z();
        m48371w();
        m48372x();
        m48365q();
        m48369u();
        m48366r();
        m48370v();
        m48367s();
    }

    /* renamed from: A */
    private void m48361A() throws C9018d {
        byte b = (byte) ((this.f35573a[1] & 24) >> 3);
        this.f35574b = b;
        String str = f35564r.get(Integer.valueOf(b));
        this.f35575c = str;
        if (str == null) {
            throw new C9018d("Invalid mpeg version");
        }
    }

    /* renamed from: l */
    public static boolean m48362l(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        return (byteBuffer.get(position) & 255) == 255 && (byteBuffer.get(position + 1) & 224) == 224 && (byteBuffer.get(position + 2) & 252) != 252;
    }

    /* renamed from: o */
    public static C9063f m48363o(ByteBuffer byteBuffer) throws C9018d {
        int position = byteBuffer.position();
        byte[] bArr = f35563q;
        byteBuffer.get(bArr, 0, 4);
        byteBuffer.position(position);
        return new C9063f(bArr);
    }

    /* renamed from: p */
    private void m48364p() throws C9018d {
        byte[] bArr = this.f35573a;
        Integer num = f35566t.get(Integer.valueOf((bArr[1] & 6) | (bArr[2] & 240) | (bArr[1] & 8)));
        this.f35578f = num;
        if (num == null) {
            throw new C9018d("Invalid bitrate");
        }
    }

    /* renamed from: q */
    private void m48365q() throws C9018d {
        int i = (this.f35573a[3] & 192) >>> 6;
        this.f35579g = i;
        String str = f35567u.get(Integer.valueOf(i));
        this.f35580h = str;
        if (str == null) {
            throw new C9018d("Invalid channel mode");
        }
    }

    /* renamed from: r */
    private void m48366r() {
        this.f35585m = (this.f35573a[3] & 8) != 0;
    }

    /* renamed from: s */
    private void m48367s() throws C9018d {
        byte b = this.f35573a[3] & 3;
        this.f35581i = b;
        this.f35582j = f35568v.get(Integer.valueOf(b));
        if (mo31585c() == null) {
            throw new C9018d("Invalid emphasis");
        }
    }

    /* renamed from: t */
    private void m48368t() throws C9018d {
        int i = (this.f35573a[1] & 6) >>> 1;
        this.f35576d = i;
        String str = f35565s.get(Integer.valueOf(i));
        this.f35577e = str;
        if (str == null) {
            throw new C9018d("Invalid Layer");
        }
    }

    /* renamed from: u */
    private void m48369u() throws C9018d {
        int i = (this.f35573a[3] & 48) >> 4;
        if (this.f35576d == 1) {
            this.f35583k = f35570x.get(Integer.valueOf(i));
            if (mo31588f() == null) {
                throw new C9018d("Invalid Mode Extension");
            }
            return;
        }
        this.f35583k = f35569w.get(Integer.valueOf(i));
        if (mo31588f() == null) {
            throw new C9018d("Invalid Mode Extension");
        }
    }

    /* renamed from: v */
    private void m48370v() {
        byte b = this.f35573a[3] & 4;
    }

    /* renamed from: w */
    private void m48371w() {
        this.f35584l = (this.f35573a[2] & 2) != 0;
    }

    /* renamed from: x */
    private void m48372x() {
        boolean z = true;
        if ((this.f35573a[2] & 1) == 0) {
            z = false;
        }
        this.f35587o = z;
    }

    /* renamed from: y */
    private void m48373y() {
        boolean z = true;
        if ((this.f35573a[1] & 1) != 0) {
            z = false;
        }
        this.f35586n = z;
    }

    /* renamed from: z */
    private void m48374z() throws C9018d {
        int i = (this.f35573a[2] & 12) >>> 2;
        Map map = f35571y.get(Integer.valueOf(this.f35574b));
        if (map != null) {
            Integer num = (Integer) map.get(Integer.valueOf(i));
            this.f35588p = num;
            if (num == null) {
                throw new C9018d("Invalid sampling rate");
            }
            return;
        }
        throw new C9018d("Invalid version");
    }

    /* renamed from: a */
    public Integer mo31583a() {
        return this.f35578f;
    }

    /* renamed from: b */
    public int mo31584b() {
        return this.f35579g;
    }

    /* renamed from: c */
    public String mo31585c() {
        return this.f35582j;
    }

    /* renamed from: d */
    public int mo31586d() {
        int i = this.f35574b;
        if (i == 0 || i == 2) {
            int i2 = this.f35576d;
            if (i2 != 1) {
                if (i2 == 2) {
                    return (((mo31583a().intValue() * 1000) * 144) / mo31592j().intValue()) + (mo31591i() * 1);
                }
                if (i2 == 3) {
                    return ((((mo31583a().intValue() * 1000) * 12) / mo31592j().intValue()) + mo31591i()) * 4;
                }
                throw new RuntimeException("Mp3 Unknown Layer:" + this.f35576d);
            } else if (mo31584b() == 3) {
                return (((mo31583a().intValue() * 1000) * 72) / mo31592j().intValue()) + (mo31591i() * 1);
            } else {
                return (((mo31583a().intValue() * 1000) * 144) / mo31592j().intValue()) + (mo31591i() * 1);
            }
        } else if (i == 3) {
            int i3 = this.f35576d;
            if (i3 == 1) {
                return (((mo31583a().intValue() * 1000) * 144) / mo31592j().intValue()) + (mo31591i() * 1);
            }
            if (i3 == 2) {
                return (((mo31583a().intValue() * 1000) * 144) / mo31592j().intValue()) + (mo31591i() * 1);
            }
            if (i3 == 3) {
                return ((((mo31583a().intValue() * 1000) * 12) / mo31592j().intValue()) + mo31591i()) * 4;
            }
            throw new RuntimeException("Mp3 Unknown Layer:" + this.f35576d);
        } else {
            throw new RuntimeException("Mp3 Unknown Version:" + this.f35574b);
        }
    }

    /* renamed from: e */
    public int mo31587e() {
        return this.f35576d;
    }

    /* renamed from: f */
    public String mo31588f() {
        return this.f35583k;
    }

    /* renamed from: g */
    public int mo31589g() {
        return ((Integer) f35559C.get(Integer.valueOf(this.f35574b)).get(Integer.valueOf(this.f35576d))).intValue();
    }

    /* renamed from: h */
    public int mo31590h() {
        int i = this.f35579g;
        if (i == 0 || i == 1 || i == 2) {
            return 2;
        }
        return i != 3 ? 0 : 1;
    }

    /* renamed from: i */
    public int mo31591i() {
        return mo31594m() ? 1 : 0;
    }

    /* renamed from: j */
    public Integer mo31592j() {
        return this.f35588p;
    }

    /* renamed from: k */
    public int mo31593k() {
        return this.f35574b;
    }

    /* renamed from: m */
    public boolean mo31594m() {
        return this.f35584l;
    }

    /* renamed from: n */
    public boolean mo31595n() {
        return false;
    }

    public String toString() {
        return " mpeg frameheader: frame length:" + mo31586d() + " version:" + this.f35575c + " layer:" + this.f35577e + " channelMode:" + this.f35580h + " noOfSamples:" + mo31589g() + " samplingRate:" + this.f35588p + " isPadding:" + this.f35584l + " isProtected:" + this.f35586n + " isPrivate:" + this.f35587o + " isCopyrighted:" + this.f35585m + " isOriginal:" + this.f35585m + " isVariableBitRate" + mo31595n() + " header as binary:" + C9117a.m48552a(this.f35573a[0]) + " " + C9117a.m48552a(this.f35573a[1]) + " " + C9117a.m48552a(this.f35573a[2]) + " " + C9117a.m48552a(this.f35573a[3]);
    }
}
