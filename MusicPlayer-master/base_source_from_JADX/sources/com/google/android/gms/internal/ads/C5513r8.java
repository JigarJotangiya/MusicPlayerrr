package com.google.android.gms.internal.ads;

import com.un4seen.bass.BASS;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.r8 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5513r8 extends qm3<C5513r8, C4920b8> implements ao3 {
    /* access modifiers changed from: private */
    public static final C5513r8 zzb;
    private long zzA;
    private long zzB;
    private long zzC;
    private String zzD = BuildConfig.FLAVOR;
    private String zzE = "D";
    private String zzF = BuildConfig.FLAVOR;
    private long zzG;
    private long zzH;
    private long zzI;
    private String zzJ = BuildConfig.FLAVOR;
    private long zzK;
    private long zzL = -1;
    private long zzM = -1;
    private C5587t8 zzN;
    private long zzO = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private String zzU = "D";
    private String zzV = "D";
    private long zzW = -1;
    private int zzX = 1000;
    private int zzY = 1000;
    private long zzZ = -1;
    private ym3<C5254k8> zzaA = qm3.m29612p();
    private int zzaB = 1000;
    private ym3<C5069f8> zzaC = qm3.m29612p();
    private C5328m8 zzaD;
    private String zzaE = BuildConfig.FLAVOR;
    private long zzaF;
    private String zzaG = BuildConfig.FLAVOR;
    private int zzaH = 2;
    private boolean zzaI;
    private String zzaJ = BuildConfig.FLAVOR;
    private long zzaK;
    private C4884a9 zzaL;
    private long zzaM;
    private String zzaN = BuildConfig.FLAVOR;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private int zzae = 1000;
    private C5402o8 zzaf;
    /* access modifiers changed from: private */
    public ym3<C5402o8> zzag = qm3.m29612p();
    private C5476q8 zzah;
    private long zzai = -1;
    private long zzaj = -1;
    private long zzak = -1;
    private long zzal = -1;
    private long zzam = -1;
    private long zzan = -1;
    private long zzao = -1;
    private long zzap = -1;
    private String zzaq = "D";
    private long zzar = -1;
    private int zzas;
    private int zzat;
    private int zzau;
    private C4995d9 zzav;
    private long zzaw = -1;
    private int zzax = 1000;
    private int zzay = 1000;
    private String zzaz = "D";
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = BuildConfig.FLAVOR;
    private String zzi = BuildConfig.FLAVOR;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private String zzt = BuildConfig.FLAVOR;
    private long zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    static {
        C5513r8 r8Var = new C5513r8();
        zzb = r8Var;
        qm3.m29616t(C5513r8.class, r8Var);
    }

    private C5513r8() {
    }

    /* renamed from: A0 */
    static /* synthetic */ void m29914A0(C5513r8 r8Var, String str) {
        str.getClass();
        r8Var.zze |= 2;
        r8Var.zzi = str;
    }

    /* renamed from: B0 */
    static /* synthetic */ void m29915B0(C5513r8 r8Var, long j) {
        r8Var.zze |= 4;
        r8Var.zzj = j;
    }

    /* renamed from: C0 */
    static /* synthetic */ void m29916C0(C5513r8 r8Var, long j) {
        r8Var.zze |= 16;
        r8Var.zzl = j;
    }

    /* renamed from: D */
    static /* synthetic */ void m29917D(C5513r8 r8Var, long j) {
        r8Var.zze |= 134217728;
        r8Var.zzI = j;
    }

    /* renamed from: D0 */
    static /* synthetic */ void m29918D0(C5513r8 r8Var, long j) {
        r8Var.zze |= 32;
        r8Var.zzm = j;
    }

    /* renamed from: E */
    static /* synthetic */ void m29919E(C5513r8 r8Var, String str) {
        str.getClass();
        r8Var.zze |= 268435456;
        r8Var.zzJ = str;
    }

    /* renamed from: E0 */
    static /* synthetic */ void m29920E0(C5513r8 r8Var, long j) {
        r8Var.zze |= 1024;
        r8Var.zzr = j;
    }

    /* renamed from: F */
    static /* synthetic */ void m29921F(C5513r8 r8Var, long j) {
        r8Var.zze |= 536870912;
        r8Var.zzK = j;
    }

    /* renamed from: F0 */
    static /* synthetic */ void m29922F0(C5513r8 r8Var, long j) {
        r8Var.zze |= 2048;
        r8Var.zzs = j;
    }

    /* renamed from: G */
    static /* synthetic */ void m29923G(C5513r8 r8Var, long j) {
        r8Var.zze |= 1073741824;
        r8Var.zzL = j;
    }

    /* renamed from: G0 */
    static /* synthetic */ void m29924G0(C5513r8 r8Var, long j) {
        r8Var.zze |= 8192;
        r8Var.zzu = j;
    }

    /* renamed from: H */
    static /* synthetic */ void m29925H(C5513r8 r8Var, long j) {
        r8Var.zze |= Integer.MIN_VALUE;
        r8Var.zzM = j;
    }

    /* renamed from: H0 */
    static /* synthetic */ void m29926H0(C5513r8 r8Var, long j) {
        r8Var.zze |= 16384;
        r8Var.zzv = j;
    }

    /* renamed from: I */
    static /* synthetic */ void m29927I(C5513r8 r8Var, long j) {
        r8Var.zzf |= 2;
        r8Var.zzO = j;
    }

    /* renamed from: I0 */
    static /* synthetic */ void m29928I0(C5513r8 r8Var, long j) {
        r8Var.zze |= 32768;
        r8Var.zzw = j;
    }

    /* renamed from: J */
    static /* synthetic */ void m29929J(C5513r8 r8Var, long j) {
        r8Var.zzf |= 4;
        r8Var.zzP = j;
    }

    /* renamed from: J0 */
    static /* synthetic */ void m29930J0(C5513r8 r8Var, long j) {
        r8Var.zze |= 65536;
        r8Var.zzx = j;
    }

    /* renamed from: K */
    static /* synthetic */ void m29931K(C5513r8 r8Var, long j) {
        r8Var.zzf |= 8;
        r8Var.zzQ = j;
    }

    /* renamed from: K0 */
    static /* synthetic */ void m29932K0(C5513r8 r8Var, long j) {
        r8Var.zze |= 524288;
        r8Var.zzA = j;
    }

    /* renamed from: L */
    static /* synthetic */ void m29933L(C5513r8 r8Var, long j) {
        r8Var.zzf |= 16;
        r8Var.zzR = j;
    }

    /* renamed from: L0 */
    static /* synthetic */ void m29934L0(C5513r8 r8Var, long j) {
        r8Var.zze |= 1048576;
        r8Var.zzB = j;
    }

    /* renamed from: M */
    static /* synthetic */ void m29935M(C5513r8 r8Var, long j) {
        r8Var.zzf |= 32;
        r8Var.zzS = j;
    }

    /* renamed from: M0 */
    static /* synthetic */ void m29936M0(C5513r8 r8Var, long j) {
        r8Var.zze |= 2097152;
        r8Var.zzC = j;
    }

    /* renamed from: N */
    static /* synthetic */ void m29937N(C5513r8 r8Var, long j) {
        r8Var.zzf |= 64;
        r8Var.zzT = j;
    }

    /* renamed from: N0 */
    static /* synthetic */ void m29938N0(C5513r8 r8Var, String str) {
        str.getClass();
        r8Var.zze |= 4194304;
        r8Var.zzD = str;
    }

    /* renamed from: O */
    static /* synthetic */ void m29939O(C5513r8 r8Var, String str) {
        str.getClass();
        r8Var.zzf |= 128;
        r8Var.zzU = str;
    }

    /* renamed from: O0 */
    static /* synthetic */ void m29940O0(C5513r8 r8Var, String str) {
        str.getClass();
        r8Var.zze |= BASS.BASS_SPEAKER_FRONT;
        r8Var.zzF = str;
    }

    /* renamed from: P */
    static /* synthetic */ void m29941P(C5513r8 r8Var, String str) {
        str.getClass();
        r8Var.zzf |= 256;
        r8Var.zzV = str;
    }

    /* renamed from: P0 */
    static /* synthetic */ void m29942P0(C5513r8 r8Var, long j) {
        r8Var.zze |= BASS.BASS_SPEAKER_REAR;
        r8Var.zzG = j;
    }

    /* renamed from: Q0 */
    static /* synthetic */ void m29943Q0(C5513r8 r8Var, long j) {
        r8Var.zze |= BASS.BASS_SPEAKER_REAR2;
        r8Var.zzH = j;
    }

    /* renamed from: R */
    static /* synthetic */ void m29944R(C5513r8 r8Var, long j) {
        r8Var.zzf |= 4096;
        r8Var.zzZ = j;
    }

    /* renamed from: S */
    static /* synthetic */ void m29945S(C5513r8 r8Var, long j) {
        r8Var.zzf |= 8192;
        r8Var.zzaa = j;
    }

    /* renamed from: T */
    static /* synthetic */ void m29946T(C5513r8 r8Var, long j) {
        r8Var.zzf |= 16384;
        r8Var.zzab = j;
    }

    /* renamed from: U */
    static /* synthetic */ void m29947U(C5513r8 r8Var, C5402o8 o8Var) {
        o8Var.getClass();
        r8Var.zzaf = o8Var;
        r8Var.zzf |= 262144;
    }

    /* renamed from: V */
    static /* synthetic */ void m29948V(C5513r8 r8Var, C5402o8 o8Var) {
        o8Var.getClass();
        ym3<C5402o8> ym3 = r8Var.zzag;
        if (!ym3.mo21839b()) {
            r8Var.zzag = qm3.m29613q(ym3);
        }
        r8Var.zzag.add(o8Var);
    }

    /* renamed from: X */
    static /* synthetic */ void m29950X(C5513r8 r8Var, C5476q8 q8Var) {
        q8Var.getClass();
        r8Var.zzah = q8Var;
        r8Var.zzf |= 524288;
    }

    /* renamed from: Z */
    static /* synthetic */ void m29951Z(C5513r8 r8Var, long j) {
        r8Var.zzf |= 2097152;
        r8Var.zzaj = j;
    }

    /* renamed from: a0 */
    static /* synthetic */ void m29952a0(C5513r8 r8Var, long j) {
        r8Var.zzf |= 4194304;
        r8Var.zzak = j;
    }

    /* renamed from: b0 */
    static /* synthetic */ void m29953b0(C5513r8 r8Var, long j) {
        r8Var.zzf |= 8388608;
        r8Var.zzal = j;
    }

    /* renamed from: c0 */
    static /* synthetic */ void m29954c0(C5513r8 r8Var, long j) {
        r8Var.zzf |= BASS.BASS_SPEAKER_REAR2;
        r8Var.zzao = j;
    }

    /* renamed from: d0 */
    static /* synthetic */ void m29955d0(C5513r8 r8Var, long j) {
        r8Var.zzf |= 134217728;
        r8Var.zzap = j;
    }

    /* renamed from: e0 */
    static /* synthetic */ void m29956e0(C5513r8 r8Var, String str) {
        str.getClass();
        r8Var.zzf |= 268435456;
        r8Var.zzaq = str;
    }

    /* renamed from: f0 */
    public static C4920b8 m29957f0() {
        return (C4920b8) zzb.mo20477v();
    }

    /* renamed from: g0 */
    static /* synthetic */ void m29958g0(C5513r8 r8Var, String str) {
        str.getClass();
        r8Var.zzg |= 1024;
        r8Var.zzaG = str;
    }

    /* renamed from: h0 */
    static /* synthetic */ void m29959h0(C5513r8 r8Var, boolean z) {
        r8Var.zzg |= 4096;
        r8Var.zzaI = z;
    }

    /* renamed from: i0 */
    static /* synthetic */ void m29960i0(C5513r8 r8Var, long j) {
        r8Var.zzg |= 16384;
        r8Var.zzaK = j;
    }

    /* renamed from: n0 */
    static /* synthetic */ void m29961n0(C5513r8 r8Var, int i) {
        r8Var.zzX = i - 1;
        r8Var.zzf |= 1024;
    }

    /* renamed from: o0 */
    static /* synthetic */ void m29962o0(C5513r8 r8Var, int i) {
        r8Var.zzY = i - 1;
        r8Var.zzf |= 2048;
    }

    /* renamed from: p0 */
    static /* synthetic */ void m29963p0(C5513r8 r8Var, int i) {
        r8Var.zzae = i - 1;
        r8Var.zzf |= 131072;
    }

    /* renamed from: q0 */
    static /* synthetic */ void m29964q0(C5513r8 r8Var, int i) {
        r8Var.zzax = i - 1;
        r8Var.zzg |= 8;
    }

    /* renamed from: r0 */
    static /* synthetic */ void m29965r0(C5513r8 r8Var, int i) {
        r8Var.zzay = i - 1;
        r8Var.zzg |= 16;
    }

    /* renamed from: s0 */
    static /* synthetic */ void m29966s0(C5513r8 r8Var, int i) {
        r8Var.zzaH = 5;
        r8Var.zzg |= 2048;
    }

    /* renamed from: u0 */
    public static C5513r8 m29968u0() {
        return zzb;
    }

    /* renamed from: v0 */
    public static C5513r8 m29969v0(byte[] bArr, cm3 cm3) throws bn3 {
        return (C5513r8) qm3.m29606B(zzb, bArr, cm3);
    }

    /* renamed from: z0 */
    static /* synthetic */ void m29970z0(C5513r8 r8Var, String str) {
        str.getClass();
        r8Var.zze |= 1;
        r8Var.zzh = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public final Object mo15709C(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            tm3 tm3 = C5735x8.f25709a;
            return qm3.m29615s(zzb, "\u0001U\u0000\u0003\u0001ĮU\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂI\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈJ\u0019ဂN\u001aဌK\u001bဈ\u0016\u001cဇL\u001dဈ\u0018\u001eဈM\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0ဌ*1ဌ+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08ဌ19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=Aဌ>Bဌ?Cဈ<Dဌ@EဉAFဂBGဂ8Hဂ9IဌCJဂ)Kဈ\u0017LဌDMဈEN\u001bOဌFP\u001bQဉGRဈHÉဉOĭဂPĮဈQ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzaF", "zzB", "zzC", "zzaG", "zzaK", "zzaH", C5106g8.f16988a, "zzD", "zzaI", "zzF", "zzaJ", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzag", C5402o8.class, "zzS", "zzT", "zzU", "zzV", "zzX", tm3, "zzY", tm3, "zzaf", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", tm3, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzao", "zzap", "zzar", "zzas", C5698w8.f25268a, "zzat", C5773y8.f26293a, "zzaq", "zzau", C4994d8.f15536a, "zzav", "zzaw", "zzam", "zzan", "zzax", tm3, "zzW", "zzE", "zzay", tm3, "zzaz", "zzaA", C5254k8.class, "zzaB", tm3, "zzaC", C5069f8.class, "zzaD", "zzaE", "zzaL", "zzaM", "zzaN"});
        } else if (i2 == 3) {
            return new C5513r8();
        } else {
            if (i2 == 4) {
                return new C4920b8((C4883a8) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: j0 */
    public final boolean mo20601j0() {
        return this.zzaI;
    }

    /* renamed from: k0 */
    public final boolean mo20602k0() {
        return (this.zze & 4194304) != 0;
    }

    /* renamed from: l0 */
    public final boolean mo20603l0() {
        return (this.zzg & 32768) != 0;
    }

    /* renamed from: m0 */
    public final int mo20604m0() {
        int a = C5143h8.m24723a(this.zzaH);
        if (a == 0) {
            return 3;
        }
        return a;
    }

    /* renamed from: w0 */
    public final C4884a9 mo20605w0() {
        C4884a9 a9Var = this.zzaL;
        return a9Var == null ? C4884a9.m20630F() : a9Var;
    }

    /* renamed from: x0 */
    public final String mo20606x0() {
        return this.zzaG;
    }

    /* renamed from: y0 */
    public final String mo20607y0() {
        return this.zzD;
    }
}
