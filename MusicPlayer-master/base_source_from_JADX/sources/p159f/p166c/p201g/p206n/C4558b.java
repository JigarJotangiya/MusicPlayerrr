package p159f.p166c.p201g.p206n;

import android.media.audiofx.DynamicsProcessing;
import androidx.recyclerview.widget.C0885l;
import com.un4seen.bass.BASS;
import p159f.p166c.p201g.C4506a;

/* renamed from: f.c.g.n.b */
/* compiled from: DynamicsEffect */
public class C4558b {

    /* renamed from: f */
    private static final int[] f13236f;

    /* renamed from: g */
    private static final int f13237g;

    /* renamed from: a */
    private DynamicsProcessing f13238a;

    /* renamed from: b */
    private DynamicsProcessing.Eq f13239b;

    /* renamed from: c */
    private DynamicsProcessing.Config.Builder f13240c;

    /* renamed from: d */
    private int f13241d = 0;

    /* renamed from: e */
    private int[] f13242e;

    static {
        int[] iArr = {31, 62, 125, C0885l.C0891f.DEFAULT_SWIPE_ANIMATION_DURATION, BASS.BASS_ERROR_JAVA_CLASS, 1000, 2000, 4000, 8000, 16000};
        f13236f = iArr;
        f13237g = iArr.length;
    }

    /* renamed from: a */
    public void mo15264a(int i, int[] iArr) {
        try {
            if (this.f13240c == null) {
                int i2 = f13237g;
                this.f13240c = new DynamicsProcessing.Config.Builder(0, 1, true, i2, true, i2, true, i2, true);
            }
            if (this.f13238a == null) {
                this.f13238a = new DynamicsProcessing(C4506a.f13119a, i, this.f13240c.build());
            } else if (this.f13241d != i) {
                mo15265b();
                this.f13238a = new DynamicsProcessing(C4506a.f13119a, i, this.f13240c.build());
            }
            if (this.f13239b == null) {
                this.f13239b = new DynamicsProcessing.Eq(true, true, f13237g);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f13241d = i;
        this.f13242e = iArr;
    }

    /* renamed from: b */
    public void mo15265b() {
        try {
            DynamicsProcessing dynamicsProcessing = this.f13238a;
            if (dynamicsProcessing != null) {
                dynamicsProcessing.setEnabled(false);
                this.f13238a.release();
                this.f13238a = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public void mo15266c(int i, int i2) {
        DynamicsProcessing.Eq eq;
        try {
            if (this.f13238a != null && (eq = this.f13239b) != null) {
                if (i2 < -15) {
                    i2 = -15;
                } else if (i2 > 15) {
                    i2 = 15;
                }
                eq.getBand(i).setEnabled(true);
                this.f13239b.getBand(i).setGain((float) i2);
                this.f13238a.setPreEqBandAllChannelsTo(i, this.f13239b.getBand(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public void mo15267d(boolean z) {
        try {
            if (this.f13240c == null) {
                int i = f13237g;
                this.f13240c = new DynamicsProcessing.Config.Builder(0, 1, true, i, true, i, true, i, true);
            }
            if (this.f13238a == null) {
                this.f13238a = new DynamicsProcessing(C4506a.f13119a, this.f13241d, this.f13240c.build());
            }
            if (this.f13239b == null) {
                this.f13239b = new DynamicsProcessing.Eq(true, true, f13237g);
            }
            this.f13238a.setEnabled(true);
            this.f13239b.setEnabled(true);
            int[] iArr = z ? this.f13242e : new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            for (int i2 = 0; i2 < iArr.length; i2++) {
                this.f13239b.getBand(i2).setCutoffFrequency((float) f13236f[i2]);
                mo15266c(i2, iArr[i2]);
                this.f13238a.setPreEqAllChannelsTo(this.f13239b);
            }
        } catch (Exception e) {
            e.printStackTrace();
            mo15265b();
        }
    }

    /* renamed from: e */
    public void mo15268e(int[] iArr) {
        this.f13242e = iArr;
        try {
            DynamicsProcessing dynamicsProcessing = this.f13238a;
            if (dynamicsProcessing != null && this.f13239b != null) {
                dynamicsProcessing.setEnabled(true);
                this.f13239b.setEnabled(true);
                for (int i = 0; i < iArr.length; i++) {
                    mo15266c(i, this.f13242e[i]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
