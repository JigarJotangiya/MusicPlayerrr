package coocent.music.player.adapter;

import android.widget.ImageView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import coocent.music.player.mode.C7060e;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p358i.C8321j;

public class WidgetAdapter extends BaseQuickAdapter<C7060e, BaseViewHolder> {
    public WidgetAdapter(int i, List<C7060e> list) {
        super(i, list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void convert(BaseViewHolder baseViewHolder, C7060e eVar) {
        C8321j.m46004j(eVar.mo27089a(), (ImageView) baseViewHolder.getView(R.id.iv_widget_icon));
        baseViewHolder.setText((int) R.id.tv_widget_name, (CharSequence) eVar.mo27090b());
    }
}
