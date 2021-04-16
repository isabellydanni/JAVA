
public class Personagem {

	private int manaPersonagem, manaMax, manaHab1, manaHab2, manaHab3, manaHab4, xp, nivelPersonagem = 1, nivelHab1 = 0,
			nivelHab2 = 0, nivelHab3 = 0, nivelHab4 = 0, habilidadesGanhas = 0;

	public Personagem(int manaMax, int manaHab1, int manaHab2, int manaHab3, int manaHab4) {
		this.manaMax = manaMax;
		this.manaHab1 = manaHab1;
		this.manaHab2 = manaHab2;
		this.manaHab3 = manaHab3;
		this.manaHab4 = manaHab4;
		manaPersonagem = manaMax;
	}

	public void adicionarXP(int xp) {

		this.xp = xp + this.xp;
		for (int xpPersonagem = this.xp; xpPersonagem >= 100; xpPersonagem = xpPersonagem - 100) {
			if (nivelPersonagem < 25) {
				nivelPersonagem++;
			}
			this.xp -= 100;
		}

	}

	public int getNivel() {
		return nivelPersonagem;
	}

	public boolean melhorarHabilidade(int habilidade) {
		boolean ok = false;
		if (habilidadesGanhas < nivelPersonagem) {
			switch (habilidade) {
			case 0:
				if (nivelHab1 < 4) {
					nivelHab1++;
					habilidadesGanhas++;
					ok = true;
				} else
					ok = false;
				break;
			case 1:
				if (nivelHab2 < 4) {
					nivelHab2++;
					habilidadesGanhas++;
					ok = true;
				} else
					ok = false;
				break;
			case 2:
				if (nivelHab3 < 4) {
					nivelHab3++;
					habilidadesGanhas++;
					ok = true;
				} else
					ok = false;
				break;
			case 3:
				if (nivelHab4 < 3 && nivelPersonagem >= 6) {
					nivelHab4++;
					habilidadesGanhas++;
					ok = true;
				} else
					ok = false;
				break;
			default:
				ok = false;
			}
		}
		return ok;
	}

	public boolean usarHabilidade(int habilidade) {
		boolean ok = false;
		switch (habilidade) {
		case 0:
			if (nivelHab1 > 0 && manaPersonagem > manaHab1 * nivelHab1) {
				manaPersonagem = manaPersonagem - manaHab1 * nivelHab1;
				ok = true;
			} else
				ok = false;
			break;
		case 1:
			if (nivelHab2 > 0 && manaPersonagem > manaHab2 * nivelHab2) {
				manaPersonagem = manaPersonagem - manaHab2 * nivelHab2;
				ok = true;
			} else
				ok = false;
			break;
		case 2:
			if (nivelHab3 > 0 && manaPersonagem > manaHab3 * nivelHab3) {
				manaPersonagem = manaPersonagem - manaHab3 * nivelHab3;
				ok = true;
			} else
				ok = false;
			break;
		case 3:
			if (nivelHab4 > 0 && manaPersonagem > manaHab4 * nivelHab4) {
				manaPersonagem = manaPersonagem - manaHab4 * nivelHab4;
				ok = true;
			} else
				ok = false;
			break;
		default:
			ok = false;
		}
		return ok;
	}

	public void consumirPocao() {
		if (this.manaPersonagem < this.manaMax) {
			manaPersonagem += 350;
		}
		if (this.manaPersonagem >= this.manaMax) {
			this.manaPersonagem = manaMax;
		}
	}

}
