package p159f.p166c.p201g.p206n;

import android.media.audiofx.PresetReverb;
import p159f.p166c.p201g.p208p.C4566b;

/* renamed from: f.c.g.n.e */
/* compiled from: ReverbEffect */
public class C4561e {

    /* renamed from: a */
    private PresetReverb f13251a;

    /* renamed from: b */
    private short f13252b;

    /* renamed from: c */
    private C4566b.C4567a f13253c;

    public C4561e(C4566b.C4567a aVar) {
        this.f13253c = aVar;
    }

    /* renamed from: a */
    private short m19877a(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 4) {
            return 4;
        }
        if (i == 5) {
            return 5;
        }
        return i == 6 ? (short) 6 : 0;
    }

    /* renamed from: b */
    public void mo15284b(short s) {
        this.f13252b = s;
    }

    /* renamed from: c */
    public void mo15285c() {
        try {
            if (this.f13251a == null) {
                this.f13251a = new PresetReverb(0, 0);
            }
            this.f13251a.setEnabled(true);
            this.f13251a.setPreset(this.f13252b);
            C4566b.C4567a aVar = this.f13253c;
            if (aVar != null) {
                aVar.mo15320D(this.f13251a.getId());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public void mo15286d() {
        try {
            PresetReverb presetReverb = this.f13251a;
            if (presetReverb != null) {
                presetReverb.setEnabled(false);
                this.f13251a.release();
                this.f13251a = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    public void mo15287e(int i) {
        mo15284b(m19877a(i));
        mo15285c();
    }
}
