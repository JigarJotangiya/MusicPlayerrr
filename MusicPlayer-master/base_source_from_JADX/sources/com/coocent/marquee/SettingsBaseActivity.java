package com.coocent.marquee;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import androidx.appcompat.app.AppCompatActivity;

public abstract class SettingsBaseActivity extends AppCompatActivity {

    /* renamed from: z */
    protected SharedPreferences f7805z;

    /* renamed from: com.coocent.marquee.SettingsBaseActivity$a */
    class C2264a implements View.OnApplyWindowInsetsListener {
        C2264a() {
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            int radius = windowInsets.getRoundedCorner(0).getRadius();
            SettingsBaseActivity settingsBaseActivity = SettingsBaseActivity.this;
            SettingsBaseActivity.this.mo8886e2(settingsBaseActivity.m10567j2(settingsBaseActivity, (float) radius));
            SettingsBaseActivity.this.getWindow().getDecorView().setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
            return view.onApplyWindowInsets(windowInsets);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public int m10567j2(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: e2 */
    public abstract void mo8886e2(int i);

    /* renamed from: g2 */
    public abstract void mo8887g2(boolean z, boolean z2);

    /* renamed from: h2 */
    public abstract void mo8888h2();

    /* renamed from: i2 */
    public abstract void mo8889i2();

    /* renamed from: k2 */
    public abstract void mo8890k2();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C2297n.m10664a(this);
        C2297n.m10667d(this, C2298o.m10755d1());
        mo8890k2();
        SharedPreferences sharedPreferences = getSharedPreferences("setting_preference", 0);
        this.f7805z = sharedPreferences;
        boolean z = true;
        if (sharedPreferences.getBoolean("first_enter_marquee_activity", true)) {
            SharedPreferences.Editor edit = this.f7805z.edit();
            edit.putBoolean("first_enter_marquee_activity", false);
            edit.putBoolean("marquee_enable", true);
            edit.apply();
            if (Build.VERSION.SDK_INT >= 31) {
                getWindow().getDecorView().setOnApplyWindowInsetsListener(new C2264a());
            }
        } else {
            z = false;
        }
        mo8889i2();
        mo8888h2();
        mo8887g2(z, false);
    }
}
