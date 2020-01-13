package mage.cards.v;

import mage.abilities.Ability;
import mage.abilities.LoyaltyAbility;
import mage.abilities.common.PlaneswalkerEntersWithLoyaltyCountersAbility;
import mage.abilities.effects.common.DamageWithPowerFromOneToAnotherTargetEffect;
import mage.abilities.effects.common.continuous.BoostControlledEffect;
import mage.abilities.effects.common.continuous.GainAbilityControlledEffect;
import mage.abilities.effects.common.counter.AddCountersTargetEffect;
import mage.abilities.keyword.TrampleAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.counters.CounterType;
import mage.filter.StaticFilters;
import mage.filter.common.FilterCreaturePermanent;
import mage.target.common.TargetControlledCreaturePermanent;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

/**
 * @author TheElk801
 */
public final class VivienOfTheArkbow extends CardImpl {

    private static final FilterCreaturePermanent filter = new FilterCreaturePermanent("creature you don't control");

    static {
        filter.add(TargetController.NOT_YOU.getControllerPredicate());
    }

    public VivienOfTheArkbow(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.PLANESWALKER}, "{4}{G}{G}");

        this.addSuperType(SuperType.LEGENDARY);
        this.subtype.add(SubType.VIVIEN);
        this.addAbility(new PlaneswalkerEntersWithLoyaltyCountersAbility(5));

        // +2: Put two +1/+1 counters on up to one target creature.
        Ability ability = new LoyaltyAbility(new AddCountersTargetEffect(CounterType.P1P1.createInstance(2)), 2);
        ability.addTarget(new TargetCreaturePermanent(0, 1));
        this.addAbility(ability);

        // −3: Target creature you control deals damage equal to its power to target creature you don't control.
        ability = new LoyaltyAbility(new DamageWithPowerFromOneToAnotherTargetEffect(), -3);
        ability.addTarget(new TargetControlledCreaturePermanent());
        ability.addTarget(new TargetCreaturePermanent(filter));
        this.addAbility(ability);

        // −9: Creatures you control get +4/+4 and gain trample until end of turn.
        ability = new LoyaltyAbility(
                new BoostControlledEffect(4, 4, Duration.EndOfTurn)
                        .setText("Creatures you control get +4/+4"), -9
        );
        ability.addEffect(new GainAbilityControlledEffect(
                TrampleAbility.getInstance(),
                Duration.EndOfTurn,
                StaticFilters.FILTER_PERMANENT_CREATURES
        ).setText("and gain trample until end of turn"));
        this.addAbility(ability);
    }

    public VivienOfTheArkbow(final VivienOfTheArkbow card) {
        super(card);
    }

    @Override
    public VivienOfTheArkbow copy() {
        return new VivienOfTheArkbow(this);
    }
}
