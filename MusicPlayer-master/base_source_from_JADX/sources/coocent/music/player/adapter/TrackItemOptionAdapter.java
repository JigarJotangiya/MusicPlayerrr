package coocent.music.player.adapter;

import android.widget.ImageView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.coocent.music.base.data.entity.Music;
import coocent.music.player.mode.C7058c;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;

public class TrackItemOptionAdapter extends BaseQuickAdapter<C7058c, BaseViewHolder> {

    /* renamed from: a */
    private Music f31111a = null;

    /* renamed from: b */
    private int f31112b = -1;

    public TrackItemOptionAdapter(int i, List<C7058c> list, int i2) {
        super(i, list);
        this.f31112b = i2;
    }

    /* renamed from: e */
    private void m40001e(BaseViewHolder baseViewHolder) {
        if (baseViewHolder.getAdapterPosition() == 0) {
            C8321j.m46000f(R.drawable.ic_library_more_palynext2, (ImageView) baseViewHolder.getView(R.id.option_image));
        } else if (baseViewHolder.getAdapterPosition() == 1) {
            C8321j.m46000f(R.drawable.ic_library_more_playlist, (ImageView) baseViewHolder.getView(R.id.option_image));
        } else if (baseViewHolder.getAdapterPosition() == 2) {
            C8321j.m46000f(R.drawable.ic_library_more_add_queue, (ImageView) baseViewHolder.getView(R.id.option_image));
        } else if (baseViewHolder.getAdapterPosition() == 3) {
            C8321j.m46000f(R.drawable.ic_library_more_ringtone, (ImageView) baseViewHolder.getView(R.id.option_image));
        } else if (baseViewHolder.getAdapterPosition() == 4) {
            ((ImageView) baseViewHolder.getView(R.id.option_image)).setImageDrawable(C8343s.m46304l(R.drawable.ic_library_more_details, R.color.default_text_color));
        } else if (baseViewHolder.getAdapterPosition() == 5) {
            if (C8287e.m45873v() == null || this.f31111a == null) {
                C8321j.m46000f(R.drawable.ic_library_more_favorite2, (ImageView) baseViewHolder.getView(R.id.option_image));
            } else if (C4477c.m19615e(C8345u.m46327h(), this.f31111a.mo9215k())) {
                C8321j.m46000f(R.drawable.ic_library_more_favorite, (ImageView) baseViewHolder.getView(R.id.option_image));
            } else {
                C8321j.m46000f(R.drawable.ic_library_more_favorite2, (ImageView) baseViewHolder.getView(R.id.option_image));
            }
        } else if (baseViewHolder.getAdapterPosition() == 6) {
            C8321j.m46000f(R.drawable.ic_library_more_share_, (ImageView) baseViewHolder.getView(R.id.option_image));
        } else if (baseViewHolder.getAdapterPosition() == 7) {
            if (this.f31112b == 7) {
                ((ImageView) baseViewHolder.getView(R.id.option_image)).setImageDrawable(C8343s.m46304l(R.drawable.ic_library_more_remove, R.color.default_text_color));
            } else {
                C8321j.m46000f(R.drawable.ic_library_more_add_delete, (ImageView) baseViewHolder.getView(R.id.option_image));
            }
        }
        ((ImageView) baseViewHolder.getView(R.id.option_image)).setBackground(C8343s.m46298f(R.drawable.popup_item_shape));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void convert(BaseViewHolder baseViewHolder, C7058c cVar) {
        baseViewHolder.setText((int) R.id.option_text, (CharSequence) cVar.mo27084a());
        baseViewHolder.setTextColor(R.id.option_text, C8343s.m46295c(R.color.default_text_color));
        m40001e(baseViewHolder);
    }

    /* renamed from: d */
    public void mo26924d(Music music) {
        this.f31111a = music;
        notifyDataSetChanged();
    }
}
