package skin.support.app;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import p082e.p109h.p119p.C3759g;
import p443m.p444a.C9317b;
import p443m.p444a.p447e.p448a.C9333e;
import p443m.p444a.p447e.p448a.C9335g;
import p443m.p444a.p451h.C9343a;
import p443m.p444a.p451h.C9344b;
import skin.support.widget.C9712c;

@Deprecated
public class SkinCompatActivity extends AppCompatActivity implements C9344b {

    /* renamed from: z */
    private C9705b f36733z;

    /* renamed from: d2 */
    public C9705b mo33813d2() {
        if (this.f36733z == null) {
            this.f36733z = C9705b.m50240b(this);
        }
        return this.f36733z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e2 */
    public void mo33814e2() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g2 */
    public void mo33815g2() {
        Drawable a;
        int g = C9333e.m49430g(this);
        if (C9712c.m50287a(g) != 0 && (a = C9335g.m49448a(this, g)) != null) {
            getWindow().setBackgroundDrawable(a);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C3759g.m16092b(getLayoutInflater(), mo33813d2());
        super.onCreate(bundle);
        mo33814e2();
        mo33815g2();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C9317b.m49321m().mo32339b(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C9317b.m49321m().mo32338a(this);
    }

    /* renamed from: t1 */
    public void mo32342t1(C9343a aVar, Object obj) {
        mo33814e2();
        mo33815g2();
        mo33813d2().mo33825a();
    }
}
