package coocent.music.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.AppCompatActivity;
import coocent.music.player.adapter.C7026i;

public class MainViewPager extends CashErrorViewPager {

    /* renamed from: r0 */
    public static final int f31603r0 = 1201707028;

    public MainViewPager(Context context) {
        super(context);
    }

    /* renamed from: Z */
    public void mo27513Z(AppCompatActivity appCompatActivity) {
        setId(f31603r0);
        setAdapter(new C7026i(appCompatActivity.mo3730H1()));
        setOffscreenPageLimit(3);
    }

    public MainViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
