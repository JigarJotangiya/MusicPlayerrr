package p402l.p406b.p407a.p418k.p419j;

import java.nio.ByteBuffer;
import p402l.p406b.p407a.p413g.C9015a;
import p402l.p406b.p407a.p416i.C9057i;

/* renamed from: l.b.a.k.j.b */
/* compiled from: Mp4AlacBox */
public class C9076b extends C9075a {

    /* renamed from: c */
    private int f35630c;

    /* renamed from: d */
    private int f35631d;

    /* renamed from: e */
    private int f35632e;

    /* renamed from: f */
    private int f35633f;

    /* renamed from: g */
    private int f35634g;

    /* renamed from: h */
    private int f35635h;

    /* renamed from: i */
    private int f35636i;

    /* renamed from: j */
    private int f35637j;

    /* renamed from: k */
    private int f35638k;

    /* renamed from: l */
    private int f35639l;

    /* renamed from: m */
    private int f35640m;

    public C9076b(C9077c cVar, ByteBuffer byteBuffer) {
        this.f35628a = cVar;
        this.f35629b = byteBuffer;
    }

    /* renamed from: c */
    public int mo31634c() {
        return this.f35639l;
    }

    /* renamed from: d */
    public int mo31635d() {
        return this.f35636i;
    }

    /* renamed from: e */
    public int mo31636e() {
        return this.f35632e;
    }

    /* renamed from: f */
    public void mo31637f() throws C9015a {
        ByteBuffer byteBuffer = this.f35629b;
        byteBuffer.position(byteBuffer.position() + 4);
        this.f35630c = C9057i.m48320w(this.f35629b);
        this.f35631d = C9057i.m48321x(this.f35629b);
        this.f35632e = C9057i.m48321x(this.f35629b);
        this.f35633f = C9057i.m48321x(this.f35629b);
        this.f35634g = C9057i.m48321x(this.f35629b);
        this.f35635h = C9057i.m48321x(this.f35629b);
        this.f35636i = C9057i.m48321x(this.f35629b);
        this.f35637j = C9057i.m48319v(this.f35629b);
        this.f35638k = C9057i.m48320w(this.f35629b);
        this.f35639l = C9057i.m48320w(this.f35629b);
        this.f35640m = C9057i.m48320w(this.f35629b);
    }

    public String toString() {
        return "maxSamplePerFrame:" + this.f35630c + "unknown1:" + this.f35631d + "sampleSize:" + this.f35632e + "historyMult:" + this.f35633f + "initialHistory:" + this.f35634g + "kModifier:" + this.f35635h + "channels:" + this.f35636i + "unknown2 :" + this.f35637j + "maxCodedFrameSize:" + this.f35638k + "bitRate:" + this.f35639l + "sampleRate:" + this.f35640m;
    }
}
