package coocent.music.player.adapter;

import android.widget.ImageView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import coocent.music.player.mode.C7058c;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8343s;

public class GenresItemOptionAdapter extends BaseQuickAdapter<C7058c, BaseViewHolder> {
    public GenresItemOptionAdapter(int i, List<C7058c> list) {
        super(i, list);
    }

    /* renamed from: d */
    private void m39949d(BaseViewHolder baseViewHolder) {
        if (baseViewHolder.getAdapterPosition() == 0) {
            ((ImageView) baseViewHolder.getView(R.id.option_image)).setImageDrawable(C8343s.m46304l(R.drawable.ic_library_more_palynext, R.color.default_text_color));
        } else if (baseViewHolder.getAdapterPosition() == 1) {
            C8321j.m46000f(R.drawable.ic_library_more_playlist, (ImageView) baseViewHolder.getView(R.id.option_image));
        } else if (baseViewHolder.getAdapterPosition() == 2) {
            C8321j.m46000f(R.drawable.ic_library_more_add_queue, (ImageView) baseViewHolder.getView(R.id.option_image));
        }
        ((ImageView) baseViewHolder.getView(R.id.option_image)).setBackground(C8343s.m46298f(R.drawable.popup_item_shape));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void convert(BaseViewHolder baseViewHolder, C7058c cVar) {
        baseViewHolder.setText((int) R.id.option_text, (CharSequence) cVar.mo27084a());
        baseViewHolder.setTextColor(R.id.option_text, C8343s.m46295c(R.color.default_text_color));
        m39949d(baseViewHolder);
    }
}
