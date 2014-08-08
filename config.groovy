//  Defaults
executor="slurm"
account="b2011196"
walltime="08:00:00"
memory="16"
jobtype="single"
queue="main"


//command sepcific configs
commands {
    
    local {
        executor="local"
    }
    
    //quick jobs 10 min and 4GB
    small {
        walltime="0:10:00"
        memory="8"

    }
    
    //medium jobs - 2 days and 128GB
    medium {
        walltime="48:00:00"
        memory="128"
    }
    
    //long - large jobs - 10 days and 128GB
    large {
        walltime="240:00:00"
        memory="128"
	    modules="bioinfo-tools java"        
    }

}

//Set tread variable
OMP_NUM_THREADS=16

//Set location of analysis base folder
basePATH=/proj/nobackup/b2011196/work/andreas/

//Set location of reference folder
RefPATH=/proj/nobackup/b2011196/data/reference/GATK/bundle_2_8/b37/

//Set name of reference fasta
REF=human_g1k_v37
