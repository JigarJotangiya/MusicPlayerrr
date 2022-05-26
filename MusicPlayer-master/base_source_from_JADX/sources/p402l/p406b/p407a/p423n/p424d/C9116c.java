package p402l.p406b.p407a.p423n.p424d;

/* renamed from: l.b.a.n.d.c */
/* compiled from: WavRIFFHeader */
public class C9116c {

    /* renamed from: a */
    private boolean f35723a = false;

    public C9116c(byte[] bArr) {
        String str = new String(bArr, 0, 4);
        String str2 = new String(bArr, 8, 4);
        if (str.equals("RIFF") && str2.equals("WAVE")) {
            this.f35723a = true;
        }
    }

    /* renamed from: a */
    public boolean mo31721a() {
        return this.f35723a;
    }

    public String toString() {
        return "RIFF-WAVE Header:\n" + "Is valid?: " + this.f35723a;
    }
}
