package coocent.music.player.adapter;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.p003d.C0524f;
import com.chad.library.adapter.base.BaseItemDraggableAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import coocent.music.player.mode.SoundEffect;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p443m.p444a.p447e.p448a.C9332d;

public class SoundEffectListAdapter extends BaseItemDraggableAdapter<SoundEffect, BaseViewHolder> {
    public SoundEffectListAdapter(int i, List<SoundEffect> list) {
        super(i, list);
    }

    /* renamed from: d */
    private void m39971d(BaseViewHolder baseViewHolder, SoundEffect soundEffect, boolean z) {
        int i;
        ImageView imageView = (ImageView) baseViewHolder.getView(R.id.sound_image);
        TextView textView = (TextView) baseViewHolder.getView(R.id.tv_using);
        boolean z2 = true;
        if (soundEffect.mo26991C() == 0) {
            imageView.setImageDrawable(C9332d.m49407d(this.mContext, R.drawable.sound_effect_icon1));
        } else if (soundEffect.mo26991C() == 1) {
            imageView.setImageDrawable(C9332d.m49407d(this.mContext, R.drawable.sound_effect_icon2));
        } else if (soundEffect.mo26991C() == 2) {
            imageView.setImageDrawable(C9332d.m49407d(this.mContext, R.drawable.sound_effect_icon3));
        } else if (soundEffect.mo26991C() == 3) {
            imageView.setImageDrawable(C9332d.m49407d(this.mContext, R.drawable.sound_effect_icon4));
        } else if (soundEffect.mo26991C() == 4) {
            imageView.setImageDrawable(C9332d.m49407d(this.mContext, R.drawable.sound_effect_icon5));
        } else if (soundEffect.mo26991C() == 5) {
            imageView.setImageDrawable(C9332d.m49407d(this.mContext, R.drawable.sound_effect_icon6));
        } else if (soundEffect.mo26991C() >= 6) {
            imageView.setImageDrawable(C9332d.m49407d(this.mContext, R.drawable.sound_effect_icon7));
        }
        if (z) {
            i = C0524f.m3223d(this.mContext.getResources(), R.color.sound_effect_text_using_colorAccent, (Resources.Theme) null);
        } else {
            i = C9332d.m49405b(this.mContext, R.color.sound_effect_text_un_use_colorAccent);
        }
        textView.setTextColor(i);
        textView.setText(this.mContext.getString(z ? R.string.using : R.string.use));
        Drawable f = C0524f.m3225f(this.mContext.getResources(), R.drawable.item_sound_effect_use_shape, (Resources.Theme) null);
        if (!z) {
            f = C0524f.m3225f(this.mContext.getResources(), R.drawable.item_sound_effect_nomal_shape, (Resources.Theme) null);
        }
        textView.setBackground(f);
        if (soundEffect.mo27046s() == 0) {
            z2 = false;
        }
        baseViewHolder.setVisible(R.id.moreBtn, z2);
        baseViewHolder.addOnClickListener(R.id.moreBtn);
        baseViewHolder.addOnClickListener(R.id.tv_using);
    }

    /* renamed from: e */
    private void m39972e(BaseViewHolder baseViewHolder, boolean z, boolean z2) {
        baseViewHolder.setGone(R.id.sound_image, !z || !z2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void convert(BaseViewHolder baseViewHolder, SoundEffect soundEffect) {
        baseViewHolder.setText((int) R.id.sound_effect_text, (CharSequence) soundEffect.mo26992D());
        baseViewHolder.setImageDrawable(R.id.drag, C9332d.m49407d(this.mContext, R.drawable.library_playlist_button02_mobile));
        baseViewHolder.setImageDrawable(R.id.moreBtn, C0524f.m3225f(this.mContext.getResources(), R.drawable.home_button04_more, (Resources.Theme) null));
        boolean M = soundEffect.mo26998M();
        m39972e(baseViewHolder, M, soundEffect.mo26999N());
        m39971d(baseViewHolder, soundEffect, M);
    }
}
