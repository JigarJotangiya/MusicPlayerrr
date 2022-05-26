package p159f.p166c.p201g.p206n;

import android.media.audiofx.Equalizer;
import android.media.audiofx.LoudnessEnhancer;
import android.os.Build;
import p159f.p166c.p201g.C4506a;

/* renamed from: f.c.g.n.d */
/* compiled from: LoudnessEffect */
public class C4560d {

    /* renamed from: a */
    private int f13246a;

    /* renamed from: b */
    private int f13247b = 0;

    /* renamed from: c */
    private LoudnessEnhancer f13248c;

    /* renamed from: d */
    private Equalizer f13249d;

    /* renamed from: e */
    private boolean f13250e = false;

    /* renamed from: f */
    private boolean m19865f() {
        if (mo15276c()) {
            m19866i();
            if (this.f13247b == 0) {
                m19866i();
            }
            try {
                LoudnessEnhancer loudnessEnhancer = new LoudnessEnhancer(this.f13247b);
                this.f13248c = loudnessEnhancer;
                loudnessEnhancer.setEnabled(true);
                int i = this.f13246a;
                if (i >= 0) {
                    this.f13248c.setTargetGain(i);
                }
                boolean enabled = this.f13248c.getEnabled();
                this.f13250e = enabled;
                return enabled;
            } catch (Exception e) {
                e.printStackTrace();
                this.f13250e = false;
            }
        }
        return false;
    }

    /* renamed from: i */
    private void m19866i() {
        if (mo15276c()) {
            try {
                LoudnessEnhancer loudnessEnhancer = this.f13248c;
                if (loudnessEnhancer != null) {
                    loudnessEnhancer.setEnabled(false);
                    this.f13248c.release();
                    this.f13248c = null;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                LoudnessEnhancer loudnessEnhancer2 = new LoudnessEnhancer(this.f13247b);
                this.f13248c = loudnessEnhancer2;
                loudnessEnhancer2.setEnabled(true);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            try {
                LoudnessEnhancer loudnessEnhancer3 = this.f13248c;
                if (loudnessEnhancer3 != null) {
                    loudnessEnhancer3.setEnabled(false);
                    this.f13248c.release();
                    this.f13248c = null;
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo15274a() {
        if (mo15276c()) {
            try {
                LoudnessEnhancer loudnessEnhancer = this.f13248c;
                if (loudnessEnhancer != null) {
                    loudnessEnhancer.setEnabled(true);
                    this.f13248c.setTargetGain(0);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f13250e = false;
    }

    /* renamed from: b */
    public void mo15275b(int i, int i2) {
        this.f13247b = i;
        if (i == 0) {
            mo15279g();
        }
        this.f13246a = i2;
    }

    /* renamed from: c */
    public boolean mo15276c() {
        return Build.VERSION.SDK_INT >= 19;
    }

    /* renamed from: d */
    public boolean mo15277d() {
        if (mo15276c()) {
            try {
                LoudnessEnhancer loudnessEnhancer = this.f13248c;
                if (loudnessEnhancer == null || !loudnessEnhancer.getEnabled() || !this.f13250e || this.f13246a < 0) {
                    return false;
                }
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo15278e() {
        if (!mo15276c()) {
            return false;
        }
        if (this.f13247b == 0) {
            m19866i();
        }
        return m19865f();
    }

    /* renamed from: g */
    public void mo15279g() {
        mo15283l();
        try {
            Equalizer equalizer = new Equalizer(C4506a.f13119a, this.f13247b);
            this.f13249d = equalizer;
            equalizer.setEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: h */
    public void mo15280h() {
        if (mo15276c()) {
            try {
                LoudnessEnhancer loudnessEnhancer = this.f13248c;
                if (loudnessEnhancer != null) {
                    loudnessEnhancer.setEnabled(false);
                    this.f13248c.release();
                    this.f13248c = null;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f13250e = false;
    }

    /* renamed from: j */
    public boolean mo15281j(boolean z) {
        if (z) {
            return mo15278e();
        }
        mo15274a();
        return false;
    }

    /* renamed from: k */
    public void mo15282k(int i) {
        if (mo15276c()) {
            this.f13246a = i;
            if (i >= 0) {
                try {
                    LoudnessEnhancer loudnessEnhancer = this.f13248c;
                    if (loudnessEnhancer != null && loudnessEnhancer.getEnabled() && ((float) i) != this.f13248c.getTargetGain()) {
                        this.f13248c.setEnabled(true);
                        this.f13248c.setTargetGain(i);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: l */
    public void mo15283l() {
        try {
            Equalizer equalizer = this.f13249d;
            if (equalizer != null) {
                equalizer.setEnabled(false);
                this.f13249d.release();
                this.f13249d = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
