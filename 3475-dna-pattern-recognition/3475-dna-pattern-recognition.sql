# Write your MySQL query statement below
select sample_id, dna_sequence, species,IF(LEFT(dna_sequence,3)="ATG",1,0) as has_start,
IF(RIGHT(dna_sequence, 3) IN ('TAA', 'TAG','TGA'),1,0) as has_stop,IF(dna_sequence LIKE '%ATAT%',1,0) as has_atat,
IF(dna_sequence LIKE '%GGG%',1,0) as has_ggg
from Samples
order by sample_id