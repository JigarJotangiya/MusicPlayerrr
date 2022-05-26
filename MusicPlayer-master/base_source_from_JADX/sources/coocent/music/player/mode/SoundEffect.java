package coocent.music.player.mode;

import android.os.Parcel;
import android.os.Parcelable;

public class SoundEffect implements Parcelable {
    public static final Parcelable.Creator<SoundEffect> CREATOR = new C7055a();

    /* renamed from: A */
    private float f31228A;

    /* renamed from: B */
    private int f31229B;

    /* renamed from: C */
    private int f31230C;

    /* renamed from: D */
    private int f31231D;

    /* renamed from: E */
    private int f31232E;

    /* renamed from: F */
    private int f31233F;

    /* renamed from: G */
    private int f31234G;

    /* renamed from: H */
    private int f31235H;

    /* renamed from: I */
    private float f31236I = 0.8f;

    /* renamed from: J */
    private int f31237J;

    /* renamed from: K */
    private int f31238K = -1;

    /* renamed from: L */
    private int f31239L = -1;

    /* renamed from: M */
    private int f31240M = -1;

    /* renamed from: N */
    private int f31241N = -1;

    /* renamed from: O */
    private int f31242O;

    /* renamed from: P */
    private int f31243P;

    /* renamed from: g */
    private int f31244g;

    /* renamed from: h */
    private boolean f31245h;

    /* renamed from: i */
    private boolean f31246i;

    /* renamed from: j */
    private String f31247j;

    /* renamed from: k */
    private String f31248k;

    /* renamed from: l */
    private int f31249l;

    /* renamed from: m */
    private float f31250m;

    /* renamed from: n */
    private float f31251n;

    /* renamed from: o */
    private float f31252o;

    /* renamed from: p */
    private float f31253p;

    /* renamed from: q */
    private float f31254q;

    /* renamed from: r */
    private float f31255r;

    /* renamed from: s */
    private float f31256s;

    /* renamed from: t */
    private float f31257t;

    /* renamed from: u */
    private float f31258u;

    /* renamed from: v */
    private float f31259v;

    /* renamed from: w */
    private int f31260w;

    /* renamed from: x */
    private int f31261x;

    /* renamed from: y */
    private int f31262y;

    /* renamed from: z */
    private int f31263z;

    /* renamed from: coocent.music.player.mode.SoundEffect$a */
    class C7055a implements Parcelable.Creator<SoundEffect> {
        C7055a() {
        }

        /* renamed from: a */
        public SoundEffect createFromParcel(Parcel parcel) {
            return new SoundEffect(parcel);
        }

        /* renamed from: b */
        public SoundEffect[] newArray(int i) {
            return new SoundEffect[i];
        }
    }

    public SoundEffect() {
    }

    /* renamed from: A */
    public int mo26989A() {
        return this.f31231D;
    }

    /* renamed from: B */
    public int mo26990B() {
        return this.f31262y;
    }

    /* renamed from: C */
    public int mo26991C() {
        return this.f31244g;
    }

    /* renamed from: D */
    public String mo26992D() {
        return this.f31247j;
    }

    /* renamed from: F */
    public int mo26993F() {
        return this.f31261x;
    }

    /* renamed from: G */
    public int mo26994G() {
        return this.f31260w;
    }

    /* renamed from: I */
    public int mo26995I() {
        return this.f31263z;
    }

    /* renamed from: J */
    public float mo26996J() {
        return this.f31236I;
    }

    /* renamed from: L */
    public int mo26997L() {
        return this.f31237J;
    }

    /* renamed from: M */
    public boolean mo26998M() {
        return this.f31245h;
    }

    /* renamed from: N */
    public boolean mo26999N() {
        return this.f31246i;
    }

    /* renamed from: O */
    public void mo27000O(int i) {
        this.f31239L = i;
    }

    /* renamed from: P */
    public void mo27001P(float f) {
        this.f31228A = f;
    }

    /* renamed from: Q */
    public void mo27002Q(int i) {
        this.f31229B = i;
    }

    /* renamed from: R */
    public void mo27003R(int i) {
        this.f31241N = i;
    }

    /* renamed from: S */
    public void mo27004S(int i) {
        this.f31238K = i;
    }

    /* renamed from: U */
    public void mo27005U(float f) {
        this.f31250m = f;
    }

    /* renamed from: V */
    public void mo27006V(float f) {
        this.f31259v = f;
    }

    /* renamed from: W */
    public void mo27007W(float f) {
        this.f31251n = f;
    }

    /* renamed from: X */
    public void mo27008X(float f) {
        this.f31252o = f;
    }

    /* renamed from: Y */
    public void mo27009Y(float f) {
        this.f31253p = f;
    }

    /* renamed from: Z */
    public void mo27010Z(float f) {
        this.f31254q = f;
    }

    /* renamed from: a */
    public int mo27011a() {
        return this.f31239L;
    }

    /* renamed from: a0 */
    public void mo27012a0(float f) {
        this.f31255r = f;
    }

    /* renamed from: b */
    public float mo27013b() {
        return this.f31228A;
    }

    /* renamed from: b0 */
    public void mo27014b0(float f) {
        this.f31256s = f;
    }

    /* renamed from: c0 */
    public void mo27015c0(float f) {
        this.f31257t = f;
    }

    /* renamed from: d */
    public int mo27016d() {
        return this.f31229B;
    }

    /* renamed from: d0 */
    public void mo27017d0(float f) {
        this.f31258u = f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int mo27019e() {
        return this.f31241N;
    }

    /* renamed from: e0 */
    public void mo27020e0(int i) {
        this.f31249l = i;
    }

    /* renamed from: f */
    public int mo27021f() {
        return this.f31238K;
    }

    /* renamed from: f0 */
    public void mo27022f0(String str) {
        this.f31248k = str;
    }

    /* renamed from: g */
    public float mo27023g() {
        return this.f31250m;
    }

    /* renamed from: g0 */
    public void mo27024g0(int i) {
        this.f31243P = i;
    }

    /* renamed from: h */
    public float mo27025h() {
        return this.f31259v;
    }

    /* renamed from: h0 */
    public void mo27026h0(int i) {
        this.f31242O = i;
    }

    /* renamed from: i */
    public float mo27027i() {
        return this.f31251n;
    }

    /* renamed from: j */
    public float mo27028j() {
        return this.f31252o;
    }

    /* renamed from: j0 */
    public void mo27029j0(boolean z) {
        this.f31245h = z;
    }

    /* renamed from: k */
    public float mo27030k() {
        return this.f31253p;
    }

    /* renamed from: k0 */
    public void mo27031k0(int i) {
        this.f31240M = i;
    }

    /* renamed from: l */
    public float mo27032l() {
        return this.f31254q;
    }

    /* renamed from: l0 */
    public void mo27033l0(int i) {
        this.f31234G = i;
    }

    /* renamed from: m */
    public float mo27034m() {
        return this.f31255r;
    }

    /* renamed from: m0 */
    public void mo27035m0(int i) {
        this.f31235H = i;
    }

    /* renamed from: n */
    public float mo27036n() {
        return this.f31256s;
    }

    /* renamed from: n0 */
    public void mo27037n0(int i) {
        this.f31232E = i;
    }

    /* renamed from: o */
    public float mo27038o() {
        return this.f31257t;
    }

    /* renamed from: o0 */
    public void mo27039o0(int i) {
        this.f31233F = i;
    }

    /* renamed from: p */
    public float mo27040p() {
        return this.f31258u;
    }

    /* renamed from: p0 */
    public void mo27041p0(int i) {
        this.f31230C = i;
    }

    /* renamed from: q */
    public int mo27042q() {
        return this.f31249l;
    }

    /* renamed from: q0 */
    public void mo27043q0(int i) {
        this.f31231D = i;
    }

    /* renamed from: r */
    public String mo27044r() {
        return this.f31248k;
    }

    /* renamed from: r0 */
    public void mo27045r0(boolean z) {
        this.f31246i = z;
    }

    /* renamed from: s */
    public int mo27046s() {
        return this.f31243P;
    }

    /* renamed from: s0 */
    public void mo27047s0(int i) {
        this.f31262y = i;
    }

    /* renamed from: t */
    public int mo27048t() {
        return this.f31242O;
    }

    /* renamed from: t0 */
    public void mo27049t0(int i) {
        this.f31244g = i;
    }

    /* renamed from: u */
    public int mo27050u() {
        return this.f31240M;
    }

    /* renamed from: u0 */
    public void mo27051u0(String str) {
        this.f31247j = str;
    }

    /* renamed from: v */
    public int mo27052v() {
        return this.f31234G;
    }

    /* renamed from: v0 */
    public void mo27053v0(int i) {
        this.f31261x = i;
    }

    /* renamed from: w */
    public int mo27054w() {
        return this.f31235H;
    }

    /* renamed from: w0 */
    public void mo27055w0(int i) {
        this.f31260w = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f31244g);
        parcel.writeByte(this.f31245h ? (byte) 1 : 0);
        parcel.writeByte(this.f31246i ? (byte) 1 : 0);
        parcel.writeString(this.f31247j);
        parcel.writeString(this.f31248k);
        parcel.writeInt(this.f31249l);
        parcel.writeFloat(this.f31250m);
        parcel.writeFloat(this.f31251n);
        parcel.writeFloat(this.f31252o);
        parcel.writeFloat(this.f31253p);
        parcel.writeFloat(this.f31254q);
        parcel.writeFloat(this.f31255r);
        parcel.writeFloat(this.f31256s);
        parcel.writeFloat(this.f31257t);
        parcel.writeFloat(this.f31258u);
        parcel.writeFloat(this.f31259v);
        parcel.writeInt(this.f31260w);
        parcel.writeInt(this.f31261x);
        parcel.writeInt(this.f31262y);
        parcel.writeInt(this.f31263z);
        parcel.writeFloat(this.f31228A);
        parcel.writeInt(this.f31229B);
        parcel.writeInt(this.f31230C);
        parcel.writeInt(this.f31231D);
        parcel.writeInt(this.f31232E);
        parcel.writeInt(this.f31233F);
        parcel.writeInt(this.f31234G);
        parcel.writeInt(this.f31235H);
        parcel.writeFloat(this.f31236I);
        parcel.writeInt(this.f31237J);
        parcel.writeInt(this.f31238K);
        parcel.writeInt(this.f31239L);
        parcel.writeInt(this.f31240M);
        parcel.writeInt(this.f31241N);
        parcel.writeInt(this.f31242O);
        parcel.writeInt(this.f31243P);
    }

    /* renamed from: x */
    public int mo27057x() {
        return this.f31232E;
    }

    /* renamed from: x0 */
    public void mo27058x0(int i) {
        this.f31263z = i;
    }

    /* renamed from: y */
    public int mo27059y() {
        return this.f31233F;
    }

    /* renamed from: y0 */
    public void mo27060y0(float f) {
        this.f31236I = f;
    }

    /* renamed from: z */
    public int mo27061z() {
        return this.f31230C;
    }

    /* renamed from: z0 */
    public void mo27062z0(int i) {
        this.f31237J = i;
    }

    protected SoundEffect(Parcel parcel) {
        this.f31244g = parcel.readInt();
        boolean z = true;
        this.f31245h = parcel.readByte() != 0;
        this.f31246i = parcel.readByte() == 0 ? false : z;
        this.f31247j = parcel.readString();
        this.f31248k = parcel.readString();
        this.f31249l = parcel.readInt();
        this.f31250m = parcel.readFloat();
        this.f31251n = parcel.readFloat();
        this.f31252o = parcel.readFloat();
        this.f31253p = parcel.readFloat();
        this.f31254q = parcel.readFloat();
        this.f31255r = parcel.readFloat();
        this.f31256s = parcel.readFloat();
        this.f31257t = parcel.readFloat();
        this.f31258u = parcel.readFloat();
        this.f31259v = parcel.readFloat();
        this.f31260w = parcel.readInt();
        this.f31261x = parcel.readInt();
        this.f31262y = parcel.readInt();
        this.f31263z = parcel.readInt();
        this.f31228A = parcel.readFloat();
        this.f31229B = parcel.readInt();
        this.f31230C = parcel.readInt();
        this.f31231D = parcel.readInt();
        this.f31232E = parcel.readInt();
        this.f31233F = parcel.readInt();
        this.f31234G = parcel.readInt();
        this.f31235H = parcel.readInt();
        this.f31236I = (float) parcel.readInt();
        this.f31237J = parcel.readInt();
        this.f31238K = parcel.readInt();
        this.f31239L = parcel.readInt();
        this.f31240M = parcel.readInt();
        this.f31241N = parcel.readInt();
        this.f31242O = parcel.readInt();
        this.f31243P = parcel.readInt();
    }
}
