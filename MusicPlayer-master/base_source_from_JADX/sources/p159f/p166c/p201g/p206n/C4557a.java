package p159f.p166c.p201g.p206n;

import android.media.audiofx.BassBoost;
import p159f.p166c.p201g.C4506a;

/* renamed from: f.c.g.n.a */
/* compiled from: BassEffect */
public class C4557a {

    /* renamed from: a */
    private BassBoost f13233a;

    /* renamed from: b */
    private int f13234b = 0;

    /* renamed from: c */
    private float f13235c;

    /* renamed from: a */
    public void mo15260a(int i, float f) {
        try {
            if (this.f13233a == null) {
                this.f13233a = new BassBoost(C4506a.f13119a, i);
            } else if (this.f13234b != i) {
                mo15261b();
                this.f13233a = new BassBoost(C4506a.f13119a, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f13234b = i;
        this.f13235c = f;
    }

    /* renamed from: b */
    public void mo15261b() {
        try {
            BassBoost bassBoost = this.f13233a;
            if (bassBoost != null) {
                if (bassBoost.getEnabled()) {
                    this.f13233a.setEnabled(false);
                }
                this.f13233a.release();
                this.f13233a = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public void mo15262c(boolean z) {
        try {
            if (this.f13233a == null) {
                this.f13233a = new BassBoost(C4506a.f13119a, this.f13234b);
            }
            if (!this.f13233a.getEnabled()) {
                this.f13233a.setEnabled(true);
            }
            float f = z ? this.f13235c : 0.0f;
            if (this.f13233a.getStrengthSupported()) {
                this.f13233a.setStrength((short) ((int) f));
            }
        } catch (Exception e) {
            e.printStackTrace();
            mo15261b();
        }
    }

    /* renamed from: d */
    public void mo15263d(float f) {
        this.f13235c = f;
        try {
            if (this.f13233a == null) {
                this.f13233a = new BassBoost(C4506a.f13119a, this.f13234b);
            }
            BassBoost bassBoost = this.f13233a;
            if (bassBoost != null) {
                if (!bassBoost.getEnabled()) {
                    this.f13233a.setEnabled(true);
                }
                if (this.f13233a.getStrengthSupported()) {
                    this.f13233a.setStrength((short) ((int) f));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
