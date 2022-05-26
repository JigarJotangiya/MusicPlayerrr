package p159f.p166c.p177d.p178h;

/* renamed from: f.c.d.h.a */
/* compiled from: LyricBean */
public class C4348a implements Comparable<C4348a> {

    /* renamed from: g */
    private long f12927g;

    /* renamed from: h */
    private String f12928h;

    /* renamed from: i */
    private long f12929i;

    public C4348a(long j, String str) {
        this.f12927g = j;
        this.f12928h = str;
    }

    /* renamed from: c */
    public int compareTo(C4348a aVar) {
        if (aVar == null) {
            return -1;
        }
        return (int) (this.f12927g - aVar.mo14757j());
    }

    /* renamed from: d */
    public long mo14755d() {
        return this.f12929i;
    }

    /* renamed from: h */
    public String mo14756h() {
        return this.f12928h;
    }

    /* renamed from: j */
    public long mo14757j() {
        return this.f12927g;
    }

    /* renamed from: k */
    public void mo14758k(long j) {
        this.f12929i = j;
    }

    public String toString() {
        return "LyricBean{time=" + this.f12927g + ", text='" + this.f12928h + '\'' + ", endTime='" + this.f12929i + '\'' + '}';
    }
}
