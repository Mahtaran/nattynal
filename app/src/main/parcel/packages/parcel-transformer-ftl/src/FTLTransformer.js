import { Transformer } from "@parcel/plugin";

export default new Transformer({
	async transform({asset}) {
		asset.type = 'html';

		return [asset];
	}
});