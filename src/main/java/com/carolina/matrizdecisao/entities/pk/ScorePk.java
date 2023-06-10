package com.carolina.matrizdecisao.entities.pk;

import com.carolina.matrizdecisao.entities.Criteria;
import com.carolina.matrizdecisao.entities.Option;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ScorePk {

    @ManyToOne
    @JoinColumn(name = "criteria_id")
    private Criteria criteria;
    @ManyToOne
    @JoinColumn(name = "option_id")
    private Option option;
}
