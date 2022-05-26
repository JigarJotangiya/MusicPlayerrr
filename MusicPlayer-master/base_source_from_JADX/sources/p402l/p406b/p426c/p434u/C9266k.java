package p402l.p406b.p426c.p434u;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Iterator;
import p402l.p406b.p426c.C9131k;
import p402l.p406b.p426c.C9134n;
import p402l.p406b.p426c.p431t.C9176c;
import p402l.p406b.p426c.p431t.C9184e;
import p402l.p406b.p426c.p431t.C9193h0;

/* renamed from: l.b.c.u.k */
/* compiled from: Lyrics3v2 */
public class C9266k extends C9256a {

    /* renamed from: h */
    private HashMap<String, C9267l> f35963h = new HashMap<>();

    public C9266k() {
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C9266k) && this.f35963h.equals(((C9266k) obj).f35963h) && super.equals(obj)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public String mo31857g() {
        return "Lyrics3v2.00";
    }

    /* renamed from: h */
    public int mo31919h() {
        int i = 0;
        for (C9267l h : this.f35963h.values()) {
            i += h.mo31919h();
        }
        return i + 11;
    }

    /* renamed from: j */
    public void mo31917j(RandomAccessFile randomAccessFile) throws IOException {
        byte[] bArr = new byte[15];
        mo32088k(randomAccessFile);
        randomAccessFile.seek(randomAccessFile.length());
        long filePointer = randomAccessFile.getFilePointer();
        for (int i = 0; i < 11; i++) {
            bArr[i] = (byte) "LYRICSBEGIN".charAt(i);
        }
        randomAccessFile.write(bArr, 0, 11);
        mo32101n("IND");
        this.f35963h.get("IND").mo32103l(randomAccessFile);
        for (C9267l next : this.f35963h.values()) {
            String g = next.mo31857g();
            boolean k = C9134n.m48562h().mo31740k(g);
            if (!g.equals("IND") && k) {
                next.mo32103l(randomAccessFile);
            }
        }
        mo31919h();
        String l = Long.toString(randomAccessFile.getFilePointer() - filePointer);
        for (int i2 = 0; i2 < 6 - l.length(); i2++) {
            bArr[i2] = 48;
        }
        int length = (6 - l.length()) + 0;
        for (int i3 = 0; i3 < l.length(); i3++) {
            bArr[i3 + length] = (byte) l.charAt(i3);
        }
        int length2 = length + l.length();
        for (int i4 = 0; i4 < 9; i4++) {
            bArr[i4 + length2] = (byte) "LYRICS200".charAt(i4);
        }
        randomAccessFile.write(bArr, 0, length2 + 9);
    }

    /* renamed from: l */
    public Iterator<C9267l> mo32099l() {
        return this.f35963h.values().iterator();
    }

    /* renamed from: m */
    public void mo32100m(C9267l lVar) {
        this.f35963h.put(lVar.mo31857g(), lVar);
    }

    /* renamed from: n */
    public void mo32101n(String str) {
        if (str.equals("IND")) {
            boolean containsKey = this.f35963h.containsKey("LYR");
            boolean z = false;
            if (containsKey) {
                z = ((C9264i) this.f35963h.get("LYR").mo31934j()).mo32096w();
            }
            mo32100m(new C9267l((C9257b) new C9262g(containsKey, z)));
        }
    }

    public String toString() {
        String str = mo31857g() + " " + mo31919h() + "\n";
        for (C9267l lVar : this.f35963h.values()) {
            str = str + lVar.toString() + "\n";
        }
        return str;
    }

    public C9266k(C9266k kVar) {
        super(kVar);
        for (String next : kVar.f35963h.keySet()) {
            this.f35963h.put(next, new C9267l(kVar.f35963h.get(next)));
        }
    }

    public C9266k(C9184e eVar) {
        if (eVar == null) {
            return;
        }
        if (eVar instanceof C9266k) {
            throw new UnsupportedOperationException("Copy Constructor not called. Please type cast the argument");
        } else if (eVar instanceof C9265j) {
            C9267l lVar = new C9267l((C9257b) new C9264i(((C9265j) eVar).mo32097l()));
            this.f35963h.put(lVar.mo31857g(), lVar);
        } else {
            Iterator I = new C9193h0(eVar).mo31892I();
            while (I.hasNext()) {
                try {
                    C9267l lVar2 = new C9267l((C9176c) I.next());
                    this.f35963h.put(lVar2.mo31857g(), lVar2);
                } catch (C9131k unused) {
                }
            }
        }
    }
}
