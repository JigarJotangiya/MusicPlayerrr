package com.coocent.marquee;

import android.os.Bundle;
import android.os.PowerManager;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;

public class MarqueeOnePixelActivity extends AppCompatActivity {
    /* renamed from: d2 */
    private void m10542d2() {
        PowerManager powerManager = (PowerManager) getSystemService("power");
        if (powerManager != null) {
            boolean z = true;
            try {
                z = powerManager.isScreenOn();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (z) {
                finish();
                return;
            }
            return;
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setGravity(8388659);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.x = 0;
        attributes.y = 0;
        attributes.height = 1;
        attributes.width = 1;
        window.setAttributes(attributes);
        m10542d2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m10542d2();
    }
}
