////////////////////////////////////////////////////////
//
// Pipeline stage definitions for RNAseqNGS pipeline 
// See call_variants.groovy for more information.
// 
////////////////////////////////////////////////////////

platypus = {
      exec """
      
      """
}

delly_inv = {
      doc "Call SV using DELLY"
      exec """
         delly -t INV -x $basePATH/human.hg19.excl.tsv -g $RefPATH/$REF.fasta -o $output_inv.vcf $inputs
         """
}

