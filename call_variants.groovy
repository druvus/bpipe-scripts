////////////////////////////////////////////////////////////
// RNAseq-based pipeline
// Assembly step
 
CONFIG_DIR="/media/data/andreas/bpipe-scripts"

load "$CONFIG_DIR/config.groovy"  
load "$CONFIG_DIR/pipeline_stages_config.groovy"

run {   
    delly_inv

}
