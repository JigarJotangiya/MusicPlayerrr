package coocent.music.player.adapter;

import android.widget.CheckBox;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import coocent.music.player.mode.C7059d;
import media.musicplayer.audioplayer.videoplayer.R;

public class PagerEffectAdapter extends BaseQuickAdapter<C7059d, BaseViewHolder> {
    /* renamed from: d */
    private void m39960d(BaseViewHolder baseViewHolder, C7059d dVar) {
        ImageView imageView = (ImageView) baseViewHolder.getView(R.id.iv_page_effect);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void convert(BaseViewHolder baseViewHolder, C7059d dVar) {
        baseViewHolder.setText((int) R.id.tv_page_effect, (CharSequence) dVar.mo27087a());
        CheckBox checkBox = (CheckBox) baseViewHolder.getView(R.id.iv_page_effect_select);
        checkBox.setChecked(dVar.mo27088b());
        checkBox.setVisibility(dVar.mo27088b() ? 0 : 8);
        m39960d(baseViewHolder, dVar);
    }
}
