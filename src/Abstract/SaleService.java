package Abstract;

import Entity.Campaign;
import Entity.Game;
import Entity.Sale;

public interface SaleService {
	void add(Sale sale, Campaign campaign, Game game);
	void update(Sale sale, Campaign campaign, Game game);
	void delete(Sale sale);
}
