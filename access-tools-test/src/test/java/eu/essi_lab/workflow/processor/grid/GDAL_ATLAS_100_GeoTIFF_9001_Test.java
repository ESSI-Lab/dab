package eu.essi_lab.workflow.processor.grid;

import org.junit.Test;

public class GDAL_ATLAS_100_GeoTIFF_9001_Test extends GDAL_ProcessorsTest {

    @Test
    public void test() throws Exception {
	super.test();
    }

    @Override
    public String getDatasetPath() {
	return "data/atlas-north-wcs100-coverage.tif";
    }

}
