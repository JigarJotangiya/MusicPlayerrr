package p402l.p406b.p407a.p423n.p424d;

import com.un4seen.bass.BASS;

/* renamed from: l.b.a.n.d.a */
/* compiled from: WavFormatHeader */
public class C9114a {

    /* renamed from: a */
    private boolean f35717a = false;

    /* renamed from: b */
    private int f35718b;

    /* renamed from: c */
    private int f35719c;

    /* renamed from: d */
    private int f35720d;

    /* renamed from: e */
    private int f35721e;

    /* renamed from: f */
    private int f35722f;

    public C9114a(byte[] bArr) {
        String str = new String(bArr, 0, 3);
        this.f35718b = (m48544f(bArr[9]) * 256) + m48544f(bArr[8]);
        if (str.equals("fmt")) {
            int i = this.f35718b;
            if (i == 1 || i == 65534) {
                this.f35719c = bArr[10];
                this.f35720d = (m48544f(bArr[15]) * BASS.BASS_SPEAKER_FRONT) + (m48544f(bArr[14]) * 65536) + (m48544f(bArr[13]) * 256) + m48544f(bArr[12]);
                this.f35721e = (m48544f(bArr[19]) * BASS.BASS_SPEAKER_FRONT) + (m48544f(bArr[18]) * 65536) + (m48544f(bArr[17]) * 256) + m48544f(bArr[16]);
                this.f35722f = m48544f(bArr[22]);
                if (this.f35718b == 65534 && m48544f(bArr[24]) == 22) {
                    m48544f(bArr[26]);
                    m48544f(bArr[31]);
                    m48544f(bArr[20]);
                    m48544f(bArr[29]);
                    m48544f(bArr[28]);
                    m48544f(bArr[33]);
                    m48544f(bArr[32]);
                }
                this.f35717a = true;
            }
        }
    }

    /* renamed from: f */
    private int m48544f(int i) {
        return i & 255;
    }

    /* renamed from: a */
    public int mo31714a() {
        return this.f35722f;
    }

    /* renamed from: b */
    public int mo31715b() {
        return this.f35721e;
    }

    /* renamed from: c */
    public int mo31716c() {
        return this.f35719c;
    }

    /* renamed from: d */
    public int mo31717d() {
        return this.f35720d;
    }

    /* renamed from: e */
    public boolean mo31718e() {
        return this.f35717a;
    }

    public String toString() {
        return "RIFF-WAVE Header:\n" + "Is valid?: " + this.f35717a;
    }
}
