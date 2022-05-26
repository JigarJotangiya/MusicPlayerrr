package p159f.p166c.p201g.p206n;

import android.media.audiofx.Virtualizer;
import p159f.p166c.p201g.C4506a;

/* renamed from: f.c.g.n.f */
/* compiled from: VirtualEffect */
public class C4562f {

    /* renamed from: a */
    private Virtualizer f13254a;

    /* renamed from: b */
    private int f13255b = 0;

    /* renamed from: c */
    private float f13256c;

    /* renamed from: a */
    public void mo15288a(int i, float f) {
        try {
            if (this.f13254a == null) {
                this.f13254a = new Virtualizer(C4506a.f13119a, i);
            } else if (this.f13255b != i) {
                mo15289b();
                this.f13254a = new Virtualizer(C4506a.f13119a, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f13255b = i;
        this.f13256c = f;
    }

    /* renamed from: b */
    public void mo15289b() {
        try {
            Virtualizer virtualizer = this.f13254a;
            if (virtualizer != null) {
                if (virtualizer.getEnabled()) {
                    this.f13254a.setEnabled(false);
                }
                this.f13254a.release();
                this.f13254a = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public void mo15290c(boolean z) {
        try {
            if (this.f13254a == null) {
                this.f13254a = new Virtualizer(C4506a.f13119a, this.f13255b);
            }
            if (!this.f13254a.getEnabled()) {
                this.f13254a.setEnabled(true);
            }
            float f = z ? this.f13256c : 0.0f;
            if (this.f13254a.getStrengthSupported()) {
                this.f13254a.setStrength((short) ((int) f));
            }
        } catch (Exception e) {
            e.printStackTrace();
            mo15289b();
        }
    }

    /* renamed from: d */
    public void mo15291d(float f) {
        this.f13256c = f;
        try {
            if (this.f13254a == null) {
                this.f13254a = new Virtualizer(C4506a.f13119a, this.f13255b);
            }
            Virtualizer virtualizer = this.f13254a;
            if (virtualizer != null) {
                if (!virtualizer.getEnabled()) {
                    this.f13254a.setEnabled(true);
                }
                if (this.f13254a.getStrengthSupported()) {
                    this.f13254a.setStrength((short) ((int) f));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
