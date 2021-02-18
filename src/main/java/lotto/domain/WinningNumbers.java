package lotto.domain;

import lotto.utils.CustomException;

public class WinningNumbers {
    private final LottoTicket lottoTicket;
    private final LottoNumber bonusBall;

    public WinningNumbers(String lottoNumbersValue, String bonusBallValue) {
        LottoTicket lottoTicket = new LottoTicket(lottoNumbersValue);
        LottoNumber bonusBall = new LottoNumber(bonusBallValue);

        validateDuplication(lottoTicket, bonusBall);

        this.lottoTicket = lottoTicket;
        this.bonusBall = bonusBall;
    }

    private void validateDuplication(LottoTicket lottoTicket, LottoNumber bonusBall) {
        if (lottoTicket.contains(bonusBall)) {
            throw new CustomException("보너스볼이 당첨번호와 중복됩니다.");
        }
    }

    //Todo :  private 수정해야함
    public int countMatches(LottoTicket lottoTicket) {
        return (int) lottoTicket.getUnmodifiableList().stream()
            .filter(this.lottoTicket::contains)
            .count();
    }

    public Rank getRank(LottoTicket lottoTicket) {
        return Rank.getInstance(countMatches(lottoTicket), lottoTicket.contains(bonusBall));
    }

}
